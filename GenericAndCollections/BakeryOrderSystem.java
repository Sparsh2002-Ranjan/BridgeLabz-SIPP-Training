import java.util.*;

class BakeryItem {
    private final String name;
    private final String category;
    public BakeryItem(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    @Override
    public String toString() {
        return name + " [" + category + "]";
    }
}

class Order<T extends BakeryItem> {
    private static long SEQ = 1;
    private final long id;
    private final T item;
    private final int quantity;
    public Order(T item, int quantity) {
        this.id = SEQ++;
        this.item = item;
        this.quantity = quantity;
    }
    public long getId() {
        return id;
    }
    public T getItem() {
        return item;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Order#" + id + " -> " + item + " x " + quantity;
    }
}

class OrderManager<T extends BakeryItem> {
    private final Queue<Order<T>> queue = new LinkedList<>();
    public void add(Order<T> order) {
        queue.offer(order);
    }
    public Order<T> deliverNext() {
        return queue.poll();
    }
    public List<Order<T>> getAll() {
        return new ArrayList<>(queue);
    }
    public List<Order<T>> filterByCategory(String category) {
        List<Order<T>> out = new ArrayList<>();
        for (Order<T> o : queue) {
            if (o.getItem().getCategory().equalsIgnoreCase(category)) {
                out.add(o);
            }
        }
        return out;
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class BakeryOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderManager<BakeryItem> manager = new OrderManager<>();
        boolean run = true;
        while (run) {
            System.out.println("\n1. Add order");
            System.out.println("2. Deliver next (FIFO)");
            System.out.println("3. View all pending orders");
            System.out.println("4. Filter orders by category");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = safeInt(sc);
            switch (choice) {
                case 1:
                    System.out.print("Item name: ");
                    String name = sc.next();
                    System.out.print("Category (cake/cookie/pastry/...): ");
                    String category = sc.next();
                    System.out.print("Quantity: ");
                    int qty = safeInt(sc);
                    manager.add(new Order<>(new BakeryItem(name, category), qty));
                    System.out.println("Order added");
                    break;
                case 2:
                    Order<BakeryItem> delivered = manager.deliverNext();
                    if (delivered == null) {
                        System.out.println("No orders to deliver");
                    } else {
                        System.out.println("Delivered: " + delivered);
                    }
                    break;
                case 3:
                    List<Order<BakeryItem>> all = manager.getAll();
                    if (all.isEmpty()) {
                        System.out.println("No pending orders");
                    } else {
                        for (Order<BakeryItem> o : all) {
                            System.out.println(o);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Category to filter: ");
                    String cat = sc.next();
                    List<Order<BakeryItem>> filtered = manager.filterByCategory(cat);
                    if (filtered.isEmpty()) {
                        System.out.println("No pending orders in this category");
                    } else {
                        for (Order<BakeryItem> o : filtered) {
                            System.out.println(o);
                        }
                    }
                    break;
                case 5:
                    run = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }

    private static int safeInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a valid number: ");
        }
        return sc.nextInt();
    }
}

import java.util.*;

class Customer {
    String name;
    List<String> items;

    public Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}

public class SmartCheckout {
    Queue<Customer> billingQueue = new LinkedList<>();
    Map<String, Integer> itemPrices = new HashMap<>();
    Map<String, Integer> itemStock = new HashMap<>();

    public void addItem(String item, int price, int stock) {
        itemPrices.put(item, price);
        itemStock.put(item, stock);
    }

    public void addCustomer(String name, List<String> items) {
        billingQueue.add(new Customer(name, items));
    }

    public void processCustomer() {
        if (billingQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = billingQueue.poll();
        System.out.println("\nProcessing: " + customer.name);
        int total = 0;
        for (String item : customer.items) {
            if (!itemPrices.containsKey(item)) {
                System.out.println("- " + item + " not found.");
                continue;
            }

            if (itemStock.get(item) <= 0) {
                System.out.println("- " + item + " is out of stock.");
                continue;
            }

            total += itemPrices.get(item);
            itemStock.put(item, itemStock.get(item) - 1);
            System.out.println("- " + item + ": ₹" + itemPrices.get(item));
        }
        System.out.println("Total Bill for " + customer.name + ": ₹" + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();

        System.out.print("Enter number of items in inventory: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item name: ");
            String name = sc.nextLine();
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            System.out.print("Enter stock: ");
            int stock = sc.nextInt();
            sc.nextLine();
            checkout.addItem(name, price, stock);
        }

        System.out.print("\nEnter number of customers: ");
        int m = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < m; i++) {
            System.out.print("Enter customer name: ");
            String custName = sc.nextLine();
            System.out.print("Enter number of items customer wants: ");
            int count = sc.nextInt();
            sc.nextLine();

            List<String> items = new ArrayList<>();
            for (int j = 0; j < count; j++) {
                System.out.print("Enter item " + (j + 1) + ": ");
                items.add(sc.nextLine());
            }

            checkout.addCustomer(custName, items);
        }

        System.out.println("\n--- Processing Customers ---");
        while (true) {
            System.out.print("\nType 'next' to process next customer or 'exit' to quit: ");
            String cmd = sc.nextLine();
            if (cmd.equalsIgnoreCase("next")) {
                checkout.processCustomer();
            } else if (cmd.equalsIgnoreCase("exit")) {
                break;
            }
        }

        sc.close();
    }
}

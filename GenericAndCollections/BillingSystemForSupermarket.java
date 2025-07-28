import java.util.*;

class ShoppingCart {
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    public ShoppingCart(String itemName, int quantity, double pricePerUnit) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    @Override
    public String toString() {
        return "[Item Name: " + itemName + ", Quantity: " + quantity + ", Price Per Unit: " + pricePerUnit + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ShoppingCart)) return false;
        ShoppingCart other = (ShoppingCart) obj;
        return this.itemName.equals(other.itemName);
    }

    @Override
    public int hashCode() {
        return itemName.hashCode();
    }
}

class Cart<T extends ShoppingCart> {
    private List<T> list = new ArrayList<>();
    private Set<T> set = new HashSet<>();

    public void addToCart(T item) {
        if (!set.contains(item)) {
            list.add(item);
            set.add(item);
        } else {
            System.out.println("Item already in cart.");
        }
    }

    public void removeFromCart(String name) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (item.getItemName().equals(name)) {
                iterator.remove();
                set.remove(item);
                System.out.println("Item removed: " + name);
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    public double totalPrice() {
        double total = 0;
        for (T item : list) {
            total += item.getQuantity() * item.getPricePerUnit();
        }
        return total;
    }

    public void viewCartItems() {
        if (list.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in cart:");
            for (T item : list) {
                System.out.println(item);
            }
        }
    }
}

class Groceries extends ShoppingCart {
    public Groceries(String itemName, int quantity, double pricePerUnit) {
        super(itemName, quantity, pricePerUnit);
    }
}

class Electronics extends ShoppingCart {
    public Electronics(String itemName, int quantity, double pricePerUnit) {
        super(itemName, quantity, pricePerUnit);
    }
}

class Clothes extends ShoppingCart {
    public Clothes(String itemName, int quantity, double pricePerUnit) {
        super(itemName, quantity, pricePerUnit);
    }
}

public class BillingSystemForSupermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart<ShoppingCart> cart = new Cart<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Supermarket Billing Menu ---");
            System.out.println("press 1 to Add Product");
            System.out.println("press 2 to Remove Product");
            System.out.println("press 3 to View Total Amount");
            System.out.println("press 4 to View All Cart Items");
            System.out.println("press 5 to Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("press 1 to add Groceries");
                    System.out.println("press 2 to add Electronics");
                    System.out.println("press 3 to add Clothes");
                    System.out.print("Enter category number: ");
                    int category = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter price per unit: ");
                    double price = sc.nextDouble();

                    switch (category) {
                        case 1:
                            cart.addToCart(new Groceries(name, quantity, price));
                            break;
                        case 2:
                            cart.addToCart(new Electronics(name, quantity, price));
                            break;
                        case 3:
                            cart.addToCart(new Clothes(name, quantity, price));
                            break;
                        default:
                            System.out.println("Invalid category.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the item name to remove: ");
                    String itemNameToRemove = sc.nextLine();
                    cart.removeFromCart(itemNameToRemove);
                    break;

                case 3:
                    double total = cart.totalPrice();
                    System.out.println("Total Amount: Rs. " + total);
                    break;

                case 4:
                    cart.viewCartItems();
                    break;

                case 5:
                    System.out.println("Final Amount to be paid: Rs. " + cart.totalPrice());
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

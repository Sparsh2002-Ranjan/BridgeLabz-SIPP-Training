import java.util.ArrayList;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemTotal() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getItemTotal());
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.getItemName() + " added to cart.");
    }

    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getItemName().equalsIgnoreCase(itemName)) {
                cart.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Item '" + itemName + "' not found in cart.");
        }
    }

    public void displayCart() {
        double total = 0;
        System.out.println("\nCart Items:");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getItemTotal();
        }
        System.out.println("Total Cost: ₹" + total);
    }
}

public class Shopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        CartItem item1 = new CartItem("Laptop", 55000, 1);
        CartItem item2 = new CartItem("Headphones", 1500, 2);
        CartItem item3 = new CartItem("Mouse", 700, 1);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.displayCart();

        System.out.println();
        cart.removeItem("Headphones");
        cart.displayCart();
    }
}

class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: ₹" + price);
    }
}

public class Investory {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Wireless Mouse", 599.00);

        item1.displayItemDetails();

        int quantity = 3;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + totalCost);
    }
}


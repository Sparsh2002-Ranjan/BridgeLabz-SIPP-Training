class Product {
    static double discount = 10.0; // in percentage

    final int productID;

    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("-----------------------------");
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 50000, 1);
        Product p2 = new Product(2, "Mouse", 700, 2);

        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }

        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }

        Product.updateDiscount(15.0);

        System.out.println("Updated Discount Applied:\n");

        if (p1 instanceof Product) {
            p1.displayProductDetails();
        }

        if (p2 instanceof Product) {
            p2.displayProductDetails();
        }
    }
}

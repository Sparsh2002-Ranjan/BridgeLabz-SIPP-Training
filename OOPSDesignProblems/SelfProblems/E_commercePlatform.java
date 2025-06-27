import java.util.ArrayList;

class Product {
    String productName;
    double price;

    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
    }

    public void display() {
        System.out.println("    Product: " + productName + ", Price: $" + price);
    }
}

class Order {
    int orderId;
    static int idCounter = 1;
    Customer customer;
    ArrayList<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.orderId = idCounter++;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("  Order ID: " + orderId);
        for (Product p : products) {
            p.display();
        }
    }
}

class Customer {
    String name;
    ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public void placeOrder(Product... products) {
        Order order = new Order(this);
        for (Product p : products) {
            order.addProduct(p);
        }
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    public void viewOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.displayOrder();
        }
    }
}

public class E_commercePlatform {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 800.00);
        Product p2 = new Product("Phone", 400.00);
        Product p3 = new Product("Headphones", 50.00);

        // Create customer
        Customer c1 = new Customer("Alice");

        // Place orders
        c1.placeOrder(p1, p2);
        c1.placeOrder(p3);

        // View orders
        System.out.println();
        c1.viewOrders();
    }
}

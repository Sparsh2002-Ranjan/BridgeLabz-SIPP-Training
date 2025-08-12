import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " - Rating: " + rating + " - Discount: " + discount + "%";
    }
}

public class CustomSortingECommerce {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 800, 4.5, 10));
        products.add(new Product("Phone", 500, 4.7, 15));
        products.add(new Product("Tablet", 300, 4.2, 20));

        System.out.println("Sort by Price:");
        products.sort(Comparator.comparingDouble(p -> p.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort(Comparator.comparingDouble((Product p) -> p.rating).reversed());
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort(Comparator.comparingDouble((Product p) -> p.discount).reversed());
        products.forEach(System.out::println);
    }
}
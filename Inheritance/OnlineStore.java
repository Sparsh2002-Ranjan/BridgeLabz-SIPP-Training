import java.util.*;

abstract class Product{
    private String name;
    private double price;

    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public abstract double calculatePrice(double a); 
    public abstract double calculateDiscount();
} 


class Grocery extends Product{

    public Grocery(String name, double price) {
        super(name, price);
    }
    @Override
    public double calculatePrice(double a) {
        return a - calculateDiscount();
    }
    @Override
    public double calculateDiscount() {
        return 0;
    }
    
}


class Electronics extends Product{

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice(double a) {
        return a - calculateDiscount();
    }

    @Override
    public double calculateDiscount() {
        double b=getPrice()*(10.0/100);
        return b;
    }
    
}


class Clothing extends Product{

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice(double a) {
        return a - calculateDiscount();
    }

    @Override
    public double calculateDiscount() {
        double b=getPrice()*(20.0/100);
        return b;
    }
    
}


public class OnlineStore {
    public static void main(String[] args) {
        List<Product> os = new ArrayList<>();
        os.add(new Grocery("fruits", 200.00));
        os.add(new Electronics("Phone", 10000.00));
        os.add(new Clothing("Shirt", 3000.00));
        for(Product p: os){
            double ct=p.calculatePrice(p.getPrice());
            System.out.println("Name: "+ p.getName() + "| Price: "+ ct);
            System.out.println();
        }
    }
}

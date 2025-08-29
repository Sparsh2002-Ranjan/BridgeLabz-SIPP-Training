import java.util.*;
import java.util.stream.*;
public class OrderRevenueSummary {
    static class Order {
        String customer;
        double total;
        Order(String customer, double total){ this.customer=customer; this.total=total; }
        public String getCustomer(){ return customer; }
        public double getTotal(){ return total; }
    }
    public static void main(String[] args){
        List<Order> orders = Arrays.asList(
            new Order("Alice",100.0),
            new Order("Bob",200.0),
            new Order("Alice",150.0)
        );
        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingDouble(Order::getTotal)));
    }
}

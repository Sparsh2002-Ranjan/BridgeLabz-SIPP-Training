import java.util.*;

public class ShoppingCart {
    private final Map<String, Double> priceCatalog = new HashMap<>();
    private final Map<String, Long> cart = new LinkedHashMap<>();

    public void addProduct(String name, double price) {
        priceCatalog.put(name, price);
    }

    public void addToCart(String name, long qty) {
        if (!priceCatalog.containsKey(name)) throw new IllegalArgumentException("Unknown product");
        cart.merge(name, qty, Long::sum);
    }

    public double total() {
        double sum = 0;
        for (Map.Entry<String, Long> e : cart.entrySet()) {
            sum += priceCatalog.get(e.getKey()) * e.getValue();
        }
        return sum;
    }

    public Map<Double, List<String>> itemsSortedByPrice() {
        Map<Double, List<String>> out = new TreeMap<>();
        for (String item : cart.keySet()) {
            double p = priceCatalog.get(item);
            out.computeIfAbsent(p, k -> new ArrayList<>()).add(item);
        }
        return out;
    }

    public Map<String, Long> itemsInInsertionOrder() {
        return new LinkedHashMap<>(cart);
    }

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addProduct("Pen", 1.5);
        sc.addProduct("Notebook", 3.0);
        sc.addToCart("Pen", 2);
        sc.addToCart("Notebook", 1);
        System.out.println(sc.itemsInInsertionOrder());
        System.out.println(sc.itemsSortedByPrice());
        System.out.println(sc.total());
    }
}

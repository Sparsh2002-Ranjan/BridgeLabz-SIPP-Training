import java.util.*;

public class MapInverter {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> input) {
        Map<V, List<K>> out = new HashMap<>();
        for (Map.Entry<K, V> e : input.entrySet()) {
            out.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        return out;
    }

    public static void main(String[] args) {
        Map<String, Integer> in = new HashMap<>();
        in.put("A", 1);
        in.put("B", 2);
        in.put("C", 1);
        System.out.println(invert(in));
    }
}

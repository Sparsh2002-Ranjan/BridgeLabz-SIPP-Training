import java.util.*;

public class MapMerger {
    public static Map<String, Long> merge(Map<String, Long> a, Map<String, Long> b) {
        Map<String, Long> out = new HashMap<>(a);
        for (Map.Entry<String, Long> e : b.entrySet()) {
            out.merge(e.getKey(), e.getValue(), Long::sum);
        }
        return out;
    }

    public static void main(String[] args) {
        Map<String, Long> m1 = new HashMap<>();
        m1.put("A", 1L);
        m1.put("B", 2L);
        Map<String, Long> m2 = new HashMap<>();
        m2.put("B", 3L);
        m2.put("C", 4L);
        System.out.println(merge(m1, m2));
    }
}

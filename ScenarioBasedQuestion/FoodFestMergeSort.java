import java.util.*;

class Stall {
    String name;
    int footfall;

    public Stall(String name, int footfall) {
        this.name = name;
        this.footfall = footfall;
    }
}

public class FoodFestMergeSort {
    
    public static List<Stall> mergeSort(List<Stall> stalls) {
        if (stalls.size() <= 1) return stalls;

        int mid = stalls.size() / 2;
        List<Stall> left = mergeSort(stalls.subList(0, mid));
        List<Stall> right = mergeSort(stalls.subList(mid, stalls.size()));

        return merge(left, right);
    }

    private static List<Stall> merge(List<Stall> left, List<Stall> right) {
        List<Stall> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).footfall <= right.get(j).footfall) {
                merged.add(left.get(i++));
            } else {
                merged.add(right.get(j++));
            }
        }

        while (i < left.size()) merged.add(left.get(i++));
        while (j < right.size()) merged.add(right.get(j++));

        return merged;
    }

    public static void main(String[] args) {
        List<Stall> zone1 = Arrays.asList(
            new Stall("TandooriTales", 120),
            new Stall("BurgerBuzz", 250)
        );

        List<Stall> zone2 = Arrays.asList(
            new Stall("SushiSpot", 100),
            new Stall("WaffleWorld", 300)
        );

        List<Stall> zone3 = Arrays.asList(
            new Stall("PizzaPlace", 150),
            new Stall("CurryCorner", 250)
        );

        List<Stall> combined = new ArrayList<>();
        combined.addAll(zone1);
        combined.addAll(zone2);
        combined.addAll(zone3);

        List<Stall> sorted = mergeSort(combined);

        System.out.println("Sorted Stalls by Footfall:");
        for (Stall s : sorted) {
            System.out.println(s.name + " - " + s.footfall);
        }
    }
}

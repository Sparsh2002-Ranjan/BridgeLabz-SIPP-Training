import java.util.*;
import java.util.stream.*;

public class MainApp {
    public static void main(String[] args) {
        List<TransportService> services = Arrays.asList(
            new BusService("Bus101", 30, 15.0),
            new MetroService("MetroBlue", 200, 25.0),
            new TaxiService("TaxiX1", 4, 100.0),
            new AmbulanceService("AmbulanceA1", 2, 0.0)
        );

        System.out.println("Available Services (using method reference):");
        services.forEach(TransportService::printServiceDetails);

        List<TransportService> filtered = services.stream()
            .filter(s -> s.getFare() > 10)
            .sorted(Comparator.comparingDouble(TransportService::getFare))
            .collect(Collectors.toList());

        System.out.println("\nFiltered and Sorted Services:");
        filtered.forEach(TransportService::printServiceDetails);

        FareCalculator fareCalc = (dist, base) -> dist * base;
        double fare = fareCalc.calculateFare(10, 5);
        System.out.println("\nFare for 10 km at base 5: " + fare);

        Map<String, List<TransportService>> grouped = services.stream()
            .collect(Collectors.groupingBy(s -> s.getClass().getSimpleName()));
        System.out.println("\nGrouped by Service Type: " + grouped.keySet());

        Map<Boolean, List<TransportService>> partitioned = services.stream()
            .collect(Collectors.partitioningBy(s -> s.getCapacity() > 50));
        System.out.println("\nPartitioned by Capacity > 50: " + partitioned.keySet());

        DoubleSummaryStatistics stats = services.stream()
            .collect(Collectors.summarizingDouble(TransportService::getFare));
        System.out.println("\nFare Statistics: " + stats);

        System.out.println("\nLive Dashboard:");
        services.forEach(s -> System.out.println(s.getName() + " active"));

        if (services.get(3) instanceof EmergencyService) {
            System.out.println("\nEmergency Service Detected: " + services.get(3).getName());
        }

        double distance = GeoUtils.calculateDistance("LocA", "LocB");
        System.out.println("\nCalculated Distance: " + distance);
    }
}

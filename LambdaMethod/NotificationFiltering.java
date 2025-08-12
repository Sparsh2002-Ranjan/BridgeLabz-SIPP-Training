import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String message;
    String type;

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = new ArrayList<>();
        alerts.add(new Alert("Patient heart rate critical", "CRITICAL"));
        alerts.add(new Alert("Regular checkup reminder", "INFO"));
        alerts.add(new Alert("Lab results available", "INFO"));

        Predicate<Alert> showOnlyCritical = alert -> alert.type.equals("CRITICAL");
        List<Alert> filteredAlerts = alerts.stream()
                                           .filter(showOnlyCritical)
                                           .collect(Collectors.toList());

        filteredAlerts.forEach(System.out::println);
    }
}
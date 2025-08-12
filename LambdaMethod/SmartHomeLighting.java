import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class SmartHomeLighting {
    public static void main(String[] args) {
        Map<String, Consumer<String>> lightActions = new HashMap<>();
        lightActions.put("motion", (room) -> System.out.println("Turning on dim lights in " + room));
        lightActions.put("day", (room) -> System.out.println("Turning off lights in " + room));
        lightActions.put("voice", (room) -> System.out.println("Changing lights to reading mode in " + room));

        lightActions.get("motion").accept("Living Room");
        lightActions.get("day").accept("Bedroom");
        lightActions.get("voice").accept("Study Room");
    }
}
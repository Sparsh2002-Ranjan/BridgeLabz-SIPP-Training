import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = str -> str.length();
        String message = "Hello, Functional Interfaces!";
        System.out.println("Length: " + lengthChecker.apply(message));
    }
}
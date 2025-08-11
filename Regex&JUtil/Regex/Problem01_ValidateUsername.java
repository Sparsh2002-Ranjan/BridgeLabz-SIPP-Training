import java.util.regex.*;
public class Problem01_ValidateUsername {
    public static boolean isValid(String s) {
        return s.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$");
    }
    public static void main(String[] args) {
        String[] tests = {"user_123","123user","us"};
        for(String t: tests) System.out.println(t + " -> " + isValid(t));
    }
}

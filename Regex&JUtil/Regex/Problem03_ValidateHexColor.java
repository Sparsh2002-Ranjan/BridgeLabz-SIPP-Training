public class Problem03_ValidateHexColor {
    public static boolean isValid(String s) {
        return s.matches("^#[A-Fa-f0-9]{6}$");
    }
    public static void main(String[] args) {
        String[] tests = {"#FFA500","#ff4500","#123"};
        for(String t: tests) System.out.println(t + " -> " + isValid(t));
    }
}

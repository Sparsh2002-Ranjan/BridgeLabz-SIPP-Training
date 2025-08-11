public class Problem15_ValidateSSN {
    public static boolean isValid(String s) {
        return s.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }
    public static void main(String[] args) {
        String[] tests = {"123-45-6789","123456789"};
        for(String t: tests) System.out.println(t + " -> " + isValid(t));
    }
}

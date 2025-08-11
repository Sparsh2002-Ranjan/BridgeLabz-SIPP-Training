public class Problem02_ValidateLicensePlate {
    public static boolean isValid(String s) {
        return s.matches("^[A-Z]{2}\\d{4}$");
    }
    public static void main(String[] args) {
        String[] tests = {"AB1234","A12345"};
        for(String t: tests) System.out.println(t + " -> " + isValid(t));
    }
}

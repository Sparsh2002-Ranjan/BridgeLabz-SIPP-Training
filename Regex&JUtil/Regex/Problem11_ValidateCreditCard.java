public class Problem11_ValidateCreditCard {
    public static boolean isVisa(String s) {
        return s.matches("^4\\d{15}$");
    }
    public static boolean isMasterCard(String s) {
        return s.matches("^5[1-5]\\d{14}$");
    }
    public static void main(String[] args) {
        String[] tests = {"4123456789012345","5123456789012345","6123456789012345"};
        for(String t: tests) System.out.println(t + " -> Visa:" + isVisa(t) + " MasterCard:" + isMasterCard(t));
    }
}

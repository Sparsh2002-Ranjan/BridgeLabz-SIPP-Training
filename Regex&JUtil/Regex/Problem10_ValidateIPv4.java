public class Problem10_ValidateIPv4 {
    public static boolean isValid(String ip) {
        return ip.matches("^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                          + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                          + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\."
                          + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$");
    }
    public static void main(String[] args) {
        String[] tests = {"192.168.0.1","255.255.255.255","256.100.50.0"};
        for(String t: tests) System.out.println(t + " -> " + isValid(t));
    }
}

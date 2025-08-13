interface SensitiveData {}
class UserCredentials implements SensitiveData {
    String username;
    String password;
    UserCredentials(String u, String p) { username = u; password = p; }
}
public class Main {
    public static void main(String[] args) {
        UserCredentials cred = new UserCredentials("admin", "1234");
        System.out.println("Sensitive data object created: " + cred.username);
    }
}
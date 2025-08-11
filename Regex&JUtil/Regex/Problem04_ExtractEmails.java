import java.util.regex.*;
public class Problem04_ExtractEmails {
    public static void extract(String text) {
        Pattern p = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,6}");
        Matcher m = p.matcher(text);
        while(m.find()) System.out.println(m.group());
    }
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        extract(text);
    }
}

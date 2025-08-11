import java.util.regex.*;
public class Problem07_ExtractLinks {
    public static void extract(String text) {
        Pattern p = Pattern.compile("https?://\\S+");
        Matcher m = p.matcher(text);
        boolean first=true;
        while(m.find()) {
            if(!first) System.out.print(", ");
            System.out.print(m.group());
            first=false;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        extract(text);
    }
}

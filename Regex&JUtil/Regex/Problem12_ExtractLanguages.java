import java.util.regex.*;
public class Problem12_ExtractLanguages {
    public static void extract(String text) {
        Pattern p = Pattern.compile("\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|PHP)\\b");
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
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        extract(text);
    }
}

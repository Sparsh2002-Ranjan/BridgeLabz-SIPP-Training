import java.util.regex.*;
import java.util.*;
public class Problem14_RepeatingWords {
    public static void findRepeats(String text) {
        Pattern p = Pattern.compile("(?i)\\b(\\w+)\\s+\\1\\b");
        Matcher m = p.matcher(text);
        Set<String> set = new LinkedHashSet<>();
        while(m.find()) set.add(m.group(1).toLowerCase());
        boolean first=true;
        for(String s: set) {
            if(!first) System.out.print(", ");
            System.out.print(s);
            first=false;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String in = "This is is a repeated repeated word test.";
        findRepeats(in);
    }
}

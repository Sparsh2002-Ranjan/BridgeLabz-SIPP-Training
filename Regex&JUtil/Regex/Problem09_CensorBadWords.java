import java.util.regex.*;
public class Problem09_CensorBadWords {
    public static String censor(String text, String[] badWords) {
        for(String w: badWords) {
            text = text.replaceAll("(?i)\\b"+Pattern.quote(w)+"\\b", "****");
        }
        return text;
    }
    public static void main(String[] args) {
        String in = "This is a damn bad example with some stupid words.";
        String[] bad = {"damn","stupid"};
        System.out.println(censor(in,bad));
    }
}

import java.util.regex.*;
public class Problem06_ExtractDates_ddmmyyyy {
    public static void extract(String text) {
        Pattern p = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b");
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
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        extract(text);
    }
}

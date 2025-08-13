import java.text.SimpleDateFormat;
import java.util.Date;
interface DateFormatter {
    static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(DateFormatter.format(new Date(), "dd/MM/yyyy"));
    }
}
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public String formatDate(String inputDate) throws ParseException {
        SimpleDateFormat sdfInput = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfOutput = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdfInput.parse(inputDate);
        return sdfOutput.format(date);
    }
}

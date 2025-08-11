import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {
    DateFormatter df = new DateFormatter();

    @Test
    void testValidDate() throws ParseException {
        assertEquals("31-12-2023", df.formatDate("2023-12-31"));
    }

    @Test
    void testInvalidDate() {
        assertThrows(ParseException.class, () -> df.formatDate("31-12-2023"));
    }
}

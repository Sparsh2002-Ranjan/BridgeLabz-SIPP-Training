import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    TemperatureConverter tc = new TemperatureConverter();

    @Test
    void testCtoF() { assertEquals(212, tc.celsiusToFahrenheit(100)); }

    @Test
    void testFtoC() { assertEquals(0, tc.fahrenheitToCelsius(32)); }
}

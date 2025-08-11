import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionExampleTest {
    @Test
    void testDivideByZero() {
        ExceptionExample ex = new ExceptionExample();
        assertThrows(ArithmeticException.class, () -> ex.divide(5, 0));
    }
}

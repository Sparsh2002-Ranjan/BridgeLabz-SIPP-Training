import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    PasswordValidator pv = new PasswordValidator();

    @Test
    void testValidPassword() { assertTrue(pv.isValid("StrongPass1")); }

    @Test
    void testInvalidPassword() { assertFalse(pv.isValid("weak")); }
}

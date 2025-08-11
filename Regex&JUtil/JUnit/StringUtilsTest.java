import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    StringUtils su = new StringUtils();

    @Test
    void testReverse() { assertEquals("cba", su.reverse("abc")); }

    @Test
    void testIsPalindrome() { assertTrue(su.isPalindrome("madam")); }

    @Test
    void testToUpperCase() { assertEquals("HELLO", su.toUpperCase("hello")); }
}

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ListManagerTest {
    ListManager lm = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        lm.addElement(list, 5);
        assertTrue(list.contains(5));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        lm.removeElement(list, 5);
        assertFalse(list.contains(5));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        lm.addElement(list, 5);
        assertEquals(1, lm.getSize(list));
    }
}

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;

public class FileProcessorTest {
    FileProcessor fp = new FileProcessor();

    @Test
    void testWriteAndReadFile() throws IOException {
        String filename = "test.txt";
        String content = "Hello World";
        fp.writeToFile(filename, content);
        assertTrue(new java.io.File(filename).exists());
        assertEquals(content, fp.readFromFile(filename));
        new java.io.File(filename).delete();
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> fp.readFromFile("nofile.txt"));
    }
}

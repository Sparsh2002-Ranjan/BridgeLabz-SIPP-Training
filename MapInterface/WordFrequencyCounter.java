import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.util.regex.*;

public class WordFrequencyCounter {
    public static Map<String, Long> count(Path file) throws IOException {
        String text = Files.readString(file);
        return count(text);
    }

    public static Map<String, Long> count(String text) {
        Map<String, Long> freq = new HashMap<>();
        Matcher m = Pattern.compile("[A-Za-z]+").matcher(text.toLowerCase(Locale.ROOT));
        while (m.find()) {
            String w = m.group();
            freq.put(w, freq.getOrDefault(w, 0L) + 1L);
        }
        return freq;
    }

    public static void main(String[] args) throws Exception {
        String sample = "Hello world, hello Java!";
        System.out.println(count(sample));
    }
}

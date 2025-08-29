import java.util.*;
import java.util.stream.*;
public class WordFrequencyCounter {
    public static void main(String[] args){
        String paragraph = "apple orange apple banana orange apple";
        String[] words = paragraph.split(" ");
        Map<String, Long> freq = Arrays.stream(words)
            .collect(Collectors.toMap(w -> w, w -> 1L, Long::sum));
    }
}

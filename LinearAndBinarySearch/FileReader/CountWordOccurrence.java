import java.io.*;

public class CountWordOccurrence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        String word = "java";
        int count = 0;
        while ((line = reader.readLine()) != null) {
            for (String w : line.split("\s+")) {
                if (w.equals(word)) count++;
            }
        }
        reader.close();
        System.out.println("Occurrences: " + count);
    }
}
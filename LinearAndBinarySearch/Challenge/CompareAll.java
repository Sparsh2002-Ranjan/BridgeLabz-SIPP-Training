import java.io.*;
import java.util.*;

public class CompareAll {
    public static void main(String[] args) throws Exception {
        int n = 1000000;

        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        System.out.println("StringBuilder time: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("hello");
        System.out.println("StringBuffer time: " + (System.nanoTime() - start) / 1e6 + " ms");

        BufferedReader reader1 = new BufferedReader(new FileReader("sample.txt"));
        int words1 = 0;
        String line;
        while ((line = reader1.readLine()) != null) words1 += line.split("\s+").length;
        reader1.close();
        System.out.println("FileReader word count: " + words1);

        BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream("sample.txt")));
        int words2 = 0;
        while ((line = reader2.readLine()) != null) words2 += line.split("\s+").length;
        reader2.close();
        System.out.println("InputStreamReader word count: " + words2);
    }
}
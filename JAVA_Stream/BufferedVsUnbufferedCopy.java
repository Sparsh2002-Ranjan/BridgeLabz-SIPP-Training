import java.io.*;

public class BufferedVsUnbufferedCopy {
    private static final int BUFFER_SIZE = 4096; 

    public static void main(String[] args) {
        String sourceFile = "source.txt";         
        String destBuffered = "destination.txt";
        String destUnbuffered = "destinationTwo.txt";

        File inputFile = new File(sourceFile);

        if (!inputFile.exists()) {
            System.out.println("Source file does not exist: " + sourceFile);
            return;
        }

        File outputFile = new File(destBuffered);

        if (!outputFile.exists()) {
            System.out.println("Source file does not exist: " + destBuffered);
            return;
        }

        File outputFileSecound = new File(destUnbuffered);

        if (!outputFileSecound.exists()) {
            System.out.println("Source file does not exist: " + destUnbuffered);
            return;
        }

        long timeBuffered = copyUsingBufferedStream(sourceFile, destBuffered);
        long timeUnbuffered = copyUsingUnbufferedStream(sourceFile, destUnbuffered);

        System.out.println("Buffered Copy Time:   " + timeBuffered + " ns");
        System.out.println("Unbuffered Copy Time: " + timeUnbuffered + " ns");

        System.out.printf("Buffered is %.2f times faster%n", 
                          (double) timeUnbuffered / timeBuffered);
    }

    public static long copyUsingBufferedStream(String source, String dest) {
        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
        return System.nanoTime() - start;
    }

    public static long copyUsingUnbufferedStream(String source, String dest) {
        long start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in unbuffered copy: " + e.getMessage());
        }
        return System.nanoTime() - start;
    }
}

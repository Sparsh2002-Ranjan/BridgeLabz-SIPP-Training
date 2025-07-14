public class CompareBufferBuilder {
    public static void main(String[] args) {
        int n = 1000000;

        long start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("hello");
        long timeBuffer = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < n; i++) sbd.append("hello");
        long timeBuilder = System.nanoTime() - start;

        System.out.println("StringBuffer Time: " + timeBuffer / 1e6 + " ms");
        System.out.println("StringBuilder Time: " + timeBuilder / 1e6 + " ms");
    }
}
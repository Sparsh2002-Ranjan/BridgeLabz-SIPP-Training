import java.util.*;

public class CircularBufferDemo {
    static class CircularBuffer {
        private final int[] a;
        private int start = 0, count = 0, cap;

        CircularBuffer(int cap) {
            this.cap = cap;
            this.a = new int[cap];
        }

        void add(int x) {
            if (count < cap) {
                a[(start + count) % cap] = x;
                count++;
            } else {
                a[start] = x;
                start = (start + 1) % cap;
            }
        }

        List<Integer> snapshot() {
            List<Integer> res = new ArrayList<>(count);
            for (int i = 0; i < count; i++) res.add(a[(start + i) % cap]);
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter max buffer size");
        int cap = sc.nextInt();
        System.out.println("enter how many numbers you want to write");
        int m = sc.nextInt();
        CircularBuffer buf = new CircularBuffer(cap);
        for (int i = 0; i < m; i++) buf.add(sc.nextInt());
        System.out.println(buf.snapshot());
        
    }
}

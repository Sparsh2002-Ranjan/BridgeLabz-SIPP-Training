import java.util.*;
public class Handshacks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int hs= (n * (n - 1)) / 2;
        System.out.print("Number of handshacks are " + hs);
    }
}

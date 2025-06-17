import java.util.*;
public class Triangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int tri=(a+b+c)/1000;
        int round=5/tri;
        System.out.print(round);
    }
}
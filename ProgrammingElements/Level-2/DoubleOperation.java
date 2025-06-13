import java.util.*;
public class DoubleOperation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Double a=sc.nextInt();
        Double b=sc.nextInt();
        Double c=sc.nextInt();
        System.out.println(a + b *c);
        System.out.println(a * b + c);
        System.out.println(c + a / b);
        System.out.println( a % b + c);
    }
}
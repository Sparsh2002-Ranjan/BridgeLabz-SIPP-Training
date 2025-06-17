import java.util.*;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        int SI=(p*r*t)/100;
        System.in.print("The Simple Interest is " + SI +" for Principal " + p +", Rate of Interest " + r +" and Time "+t);
    }
}
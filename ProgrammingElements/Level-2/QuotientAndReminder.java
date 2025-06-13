import java.util.*;
public class QuotientAndReminder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        double quo=n1/n2;
        int rem=n1%n2;
        System.out.print("The Quotient is " + quo +" and Reminder is " + rwm +" of two number " + n1 +" and "+n2);
    }
}
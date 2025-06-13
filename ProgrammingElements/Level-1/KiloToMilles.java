import java.util.*;
public class KiloToMilles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double kilo=sc.nextInt();
        double b=kilo*1.6;
        System.out.print("The total miles is " + b +" mile for the given " + kilo + " km");
    }
}

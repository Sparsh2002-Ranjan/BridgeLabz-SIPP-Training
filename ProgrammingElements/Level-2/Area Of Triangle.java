import java.util.*;
public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int base=sc.nextInt();
        int area=(1/2)*base*height;
        double sqin=area*2.54;
        System.out.print("Your Height in cm is " + height + " and inches is "+ sqin);
        
    }
}
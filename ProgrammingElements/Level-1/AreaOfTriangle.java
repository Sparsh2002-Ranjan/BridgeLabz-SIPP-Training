import java.util.*;
public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int base=sc.nextInt();
        int area=(1/2)*base*height;
        double inch=area*2.54;
        double feet=inch*12;
        System.out.print("Your Height in cm is " + height + "while in feet is "+ feet +" and inches is "+ inch);
        
    }
}
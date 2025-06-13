import java.util.*;
public class FeetAndInches{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        double inches=height*2.54;
        double foot=inches*12;
        System.out.print("Your Height in cm is "+ height +" while in feet is "+ inches +"and inches is"+ foot);
    }
}
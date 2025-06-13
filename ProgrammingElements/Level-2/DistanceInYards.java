import java.util.*;
public class DistanceInYards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height=sc.nextInt();
        double yard=height*3;
        double inches=yard*1760;
        System.out.print("Your Height in feet is "+ height +" while in yard is "+ yard +" and inches is "+ inches);
    }
}

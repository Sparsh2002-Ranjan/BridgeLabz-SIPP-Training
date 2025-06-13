import java.util.*;
public class UniversityDiscount2{
    public static void main(String[] args) {
        int fee=sc.nextInt();
        int a=sc.nextInt();
        double discount=(fee*a)/100;
        double newfee=fee-discount;
        System.out.print("The discount amount is INR "+ discount +"and final discounted fee is INR" + newfee);
    }
}
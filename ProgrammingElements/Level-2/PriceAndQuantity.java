import java.util.*;
public class PriceAndQuantity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int quantity=sc.nextInt();
        int total=quantity*price;
        System.out.print("The total purchase price is INR "+ total +" if the quantity "+ quantity +" and unit price is INR"+ price);
    }
}

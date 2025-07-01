import java.util.*;
public class Coffee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean b=true;
        int sum=0;
        while(b){
            System.out.println("press coffee to choose your coffee");
            System.out.println("press amount to check the amount");
            System.out.println("write exit to give your order");
            String st=sc.next();
            if(st.toLowerCase().equals("coffee")){
                System.out.println("press 1 to choose Americano (120 Rs) + 12% GST");
                System.out.println("press 2 to choose Cappuccino  (130 Rs) + 12% GST");
                System.out.println("press 3 to choose Mocha (135 Rs) + 12% GST");
                System.out.println("press 4 to choose Espresso (140 Rs) + 12% GST");
                System.out.println("press 5 to choose Latte (110 Rs) + 12% GST");
                int n=sc.nextInt();
                int gst=n*(12/100);
                if(n==1)sum=sum+120+gst;
                else if(n==2)sum=sum+130+gst;
                else if(n==3)sum=sum+135+gst;
                else if(n==4)sum=sum+140+gst;
                else if(n==5) sum =sum+110+gst;
                else{
                    System.out.println("Invalid Input");
                }
            }else if(st.toLowerCase().equals("amount")){
                System.out.println();
                System.out.println("==>> your amount is " + sum +" Rupees");
                System.out.println();
            }else if(st.toLowerCase().equals("exit")){
                b=false;
                break;
            }else{
                System.out.println();
                System.out.println("Invalid Input");
                System.out.println();
            }
        }
        System.out.println("==>> Your order of Rupees " + sum +" has been successfully completed");
    }
}
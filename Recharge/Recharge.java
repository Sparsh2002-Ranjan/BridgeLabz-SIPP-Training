import java.util.*;
public class Recharge{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        boolean b=true;
        while(b){
            System.out.println("press 1 for recharge");
            System.out.println("press 2 to check total amount");
            System.out.println("press 3 to exit");
            int a=sc.nextInt();
            if(a==3){
                b=false;
                break;
            }
            else if(a==2)System.out.println(sum);
            else if(a==1){
                System.out.println("press 1 for jio recharge");
                System.out.println("press 2 for airtel recharge");
                System.out.println("press 3 for idea recharge");
                int c=sc.nextInt();
                if(c==1){
                    System.out.println("jio recharges are:");
                    System.out.println("press 1 for 300 rupees recharge");
                    System.out.println("press 2 for 500 rupees recharge");
                    System.out.println("press 3 for 700 rupees recharge");
                    int d=sc.nextInt();
                    if(d==1)sum=sum+300;
                    else if(d==2)sum=sum+500;
                    else if(d==3)sum=sum+700;
                    else{
                        System.out.println("Invalid data");
                    }
                }
                else if(c==2){
                    System.out.println("airtel recharges are:");
                    System.out.println("press 1 for 300 rupees recharge");
                    System.out.println("press 2 for 500 rupees recharge");
                    System.out.println("press 3 for 700 rupees recharge");
                    int d=sc.nextInt();
                    if(d==1)sum=sum+300;
                    else if(d==2)sum=sum+500;
                    else if(d==3)sum=sum+700;
                    else{
                        System.out.println("Invalid data");
                    }
                }else if(c==3){
                    System.out.println("idea recharges are:");
                    System.out.println("press 1 for 300 rupees recharge");
                    System.out.println("press 2 for 500 rupees recharge");
                    System.out.println("press 3 for 700 rupees recharge");
                    int d=sc.nextInt();
                    if(d==1)sum=sum+300;
                    else if(d==2)sum=sum+500;
                    else if(d==3)sum=sum+700;
                    else{
                        System.out.println("Invalid data");
                    }
                }
            }
            else{
                System.out.println("Invalid data");
            }
        }
        System.out.println("recharge is successful of rupess " + sum);
    }
}
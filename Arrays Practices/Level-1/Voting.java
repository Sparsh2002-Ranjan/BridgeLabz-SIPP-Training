import java.util.*;
public class Voting{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>=18)System.out.print("Eligible to vote");
            else System.out.print("Not Eligible to vote");
            
        }

    }
}
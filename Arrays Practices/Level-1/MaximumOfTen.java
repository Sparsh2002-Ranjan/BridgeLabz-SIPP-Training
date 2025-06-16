import java.util.*;
public class MaximumOfTen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            int a=sc.nextInt();
            if(a<=0)break;
            else{
                arr[i]=a;
                sum=sum+a;
            }
        }
        System.out.print("All the numbers are ");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print("and the sum is " + sum);

    }
}

import java.util.*;
public class NumberState {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for( int i=0;i<5;i++){
            if(arr[i]==0){
                System.out.print("the number is zero");
            }
            else if(arr[i]>0){
                System.out.print("the number is positive");
            }
            else{
                System.out.print("the number is negitive");
            }

            
            if(arr[i]>0 && arr[i]%2==0)System.out.print("the number is even");
            else System.out.print("the number is odd");
        }

        if(arr[0]==arr[arr.length-1]){
            System.out.print("the numbers are equal");
        }else if(arr[0]>arr[arr.length-1]){
                System.out.print("the number at starting is greater than ending number");
        }else{
                System.out.print("the number at ending is greater than starting number");
        }
    }
}

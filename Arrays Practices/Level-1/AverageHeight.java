import java.util.*;
public class AverageHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[11];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=sum/11;
        System.out.print(avg);
    }
}

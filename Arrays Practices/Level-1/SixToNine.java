import java.util.*;
public class SixToNine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[4];
        int a=0;
        for(int i=6;i<=9;i++){
            arr[a]=n*i;
            a++;
            System.out.println(arr[a-1]);
        }
    }
}

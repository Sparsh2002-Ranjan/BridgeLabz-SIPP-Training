import java.util.*;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String a=Integer.toBinaryString(i);
            list.add("\""+ a +" \"");
        }
        System.out.println(list);
    }
}

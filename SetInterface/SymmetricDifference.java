import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        HashSet<Integer>set3=new HashSet<>();
        System.out.println("enter size of set 1");
        int n=sc.nextInt();
        System.out.println("Enter the values of set 1");
        for(int i=0;i<n;i++){
            set1.add(sc.nextInt());
        }
        System.out.println("Enter size of set 2");
        int m=sc.nextInt();
        System.out.println("Enter the values of set 2");
        for(int i=0;i<m;i++){
            set2.add(sc.nextInt());
        }
        for(int it :set1){
            if(!set2.contains(it))set3.add(it);
        }
        for(int it :set2){
            if(!set1.contains(it))set3.add(it);
        }
        System.out.print(set3);
    }
}
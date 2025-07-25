import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer>set=new TreeSet<>();
        System.out.println("enter set length");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        System.out.print(set);
    }
}

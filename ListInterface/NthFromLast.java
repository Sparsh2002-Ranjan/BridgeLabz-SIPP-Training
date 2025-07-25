import java.util.*;

public class NthFromLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String>list=new LinkedList<>();
        LinkedList<String>list2=new LinkedList<>();
        System.out.println("Write total number of elements in the list");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String a=sc.next();
            list.add(a);
            list2.addFirst(a);
        }
        System.out.println("write the index of element you want to find from last");
        int k=sc.nextInt();
        if((k-1)<n)System.out.print(list2.get(k-1));
        else System.out.print("Invalid Index");


    }
}

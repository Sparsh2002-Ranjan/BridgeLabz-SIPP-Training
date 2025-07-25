import java.util.*;

public class ReverseAList{

    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Write total number of elements in the list");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            list.add(a);
            list2.addFirst(a);
        }

        System.out.println("Original List :- ");
        System.out.println(list);
        System.out.println("Reversed List :- ");
        System.out.println(list2);

    }
}
import java.util.*;

public class RotateElemment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Write total number of elements in the list");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("write index value from where you wnats to rotate the list");
        int k=sc.nextInt();
        if(k<list.size()){
            for(int i=0;i<k;i++){
                int a=list.get(0);
                list.remove(0);
                list.add(a);
            }
            System.out.println(list);

        }else System.out.print("Invalid Index");
    }
}

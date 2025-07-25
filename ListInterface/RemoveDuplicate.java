import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write no of elements");
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int z=sc.nextInt();
            if(!set.contains(z)){
                list.add(z);
                set.add(z);
            }
            
        }
        System.out.println(list);
    }
}

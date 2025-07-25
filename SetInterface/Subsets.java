import java.util.*;

public class Subsets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        boolean b=true;
        System.out.println("enter size of MAIN set");
        int n=sc.nextInt();
        System.out.println("Enter the values of main set");
        for(int i=0;i<n;i++){
            set1.add(sc.nextInt());
        }
        System.out.println("Enter size of SUBSET set ");
        int m=sc.nextInt();
        System.out.println("Enter the values of Subset set");
        for(int i=0;i<m;i++){
            set2.add(sc.nextInt());
        }
        for(int t : set2){
            if(set1.contains(t))continue;
            else{
                b=false;
                break;
            }
        }
        System.out.println(b);
    }
}

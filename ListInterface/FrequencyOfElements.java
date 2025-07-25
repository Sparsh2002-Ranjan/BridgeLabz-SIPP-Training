import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>map=new HashMap<>();
        System.out.println("Write total number of elements in the map");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String a=sc.next();
            if(map.containsKey(a)){
                int c=map.get(a)+1;
                map.put(a,c);
            }else map.put(a,1);
        }
            System.out.print(map);
    }
}

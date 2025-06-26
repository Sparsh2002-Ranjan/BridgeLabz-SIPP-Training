import java.util.*;
public class ReverseAString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        char[] ch=st.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
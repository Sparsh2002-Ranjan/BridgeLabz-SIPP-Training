import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=0;
        int start=0;
        int end=0;
        char[] ch=s.toCharArray();
        while(a<s.length()){
            end=a;
            if(ch[a]==' ' || a==s.length()-1){
                if(a!=s.length()-1)end=end-1;
                print(ch,start,end);
                start=end+1;
                
            }
            a++;
        }
    }
    
    public static void print(char[] ch,int st,int end){
        for(int i=end;i>=st;i--){
            System.out.print(ch[i]);
        }
        System.out.print(" ");
    }
}
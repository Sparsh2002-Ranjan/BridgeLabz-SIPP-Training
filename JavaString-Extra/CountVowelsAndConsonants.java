import java.util.*;
public class CountVowelsAndConsonants{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String st=sc.next();
        st=st.toLowerCase();
        char[] ch=st.toCharArray();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')vowels++;
            else{
                consonants++;
            } 
        }
        System.out.println("vowels: " + vowels);
        System.out.print("consonants: " + consonants);
    }
}
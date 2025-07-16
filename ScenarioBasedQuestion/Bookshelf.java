import java.util.*;

class Library {
        LinkedList<String> list = new LinkedList<>();
        HashMap<String, LinkedList<String>> map = new HashMap<>();

        public Library(){
            map.put("Novel",new LinkedList<>());
            map.put("Mystery",new LinkedList<>());
            map.put("Thriller",new LinkedList<>());
            map.put("Science-Fiction",new LinkedList<>());
            map.put("History",new LinkedList<>());
        }

        public void borrow(String a, String b){
            if(map.containsKey((a))){
                list=map.get(a);
                LinkedList<String> li = list;
                for(int i=0;i<list.size();i++){
                    if(list.equals(b))list.remove(i);
                }
                map.put(a,li);
                list=null;
            }else{
                System.out.println("Invalid Input");
            }
        }
        
        public void returnBook(String a, String b){
            
            list=map.get(a);
            LinkedList<String> li = list;
            list.add(b);
            map.put(a,li);
            list=null;
            
        }
    }
    
    
public class Bookshelf {

public static String find(String a) {
    Scanner sc=new Scanner(System.in);
    if(a.equals("Novel")){
        System.out.println("press 1 for The Whispering Pines");
        System.out.println("press 2 for Echoes of Yesterday");
        System.out.println("press 3 for The Clockmaker's Daughter");
        System.out.println("press 4 for Beneath the Silent City");
        int c=sc.nextInt();
        if(c==1)return "The Whispering Pines";
        else if(c==2)return "Echoes of Yesterday";
        else if(c==3)return "The Clockmaker's Daughter";
        else if(c==4)return "Beneath the Silent City";
        else return "Invalid";

    }
    else if(a.equals("Mystery")){
        System.out.println("press 1 for The Shadow of Blackwood");
        System.out.println("press 2 for The Vanishing Point");
        System.out.println("press 3 for The Silent Witness");
        System.out.println("press 4 for The Obsidian Cipher");
        int c=sc.nextInt();
        if(c==1)return "The Shadow of Blackwood";
        else if(c==2)return "The Vanishing Point";
        else if(c==3)return "The Silent Witness";
        else if(c==4)return "The Obsidian Cipher";
        else return "Invalid";
    }
    else if(a.equals("Thriller")){
        System.out.println("press 1 for The Crimson Conspiracy");
        System.out.println("press 2 for The Silent Patient");
        System.out.println("press 3 for The Girl on the Train");
        System.out.println("press 4 for The Housemaid");
        int c=sc.nextInt();
        if(c==1)return "The Crimson Conspiracy";
        else if(c==2)return "The Silent Patient";
        else if(c==3)return "The Girl on the Train";
        else if(c==4)return "The Housemaid";
        else return "Invalid";
        
    }
    else if(a.equals("Science-Fiction")){
        System.out.println("press 1 for The Starseeker's Curse");
        System.out.println("press 2 for The Glass Citadel");
        System.out.println("press 3 for Echoes of the Aether");
        System.out.println("press 4 for The Obsidian Gate");
        int c=sc.nextInt();
        if(c==1)return "The Starseeker's Curse";
        else if(c==2)return "The Glass Citadel";
        else if(c==3)return "Echoes of the Aether";
        else if(c==4)return "The Obsidian Gate";
        else return "Invalid";
        
    }
    else if(a.equals("History")){
        System.out.println("press 1 for A Tail of Two Cities");
        System.out.println("press 2 for The Guns of August");
        System.out.println("press 3 for The Nightingale");
        System.out.println("press 4 for The Book Thief");
        int c=sc.nextInt();
        if(c==1)return "A Tail of Two Cities";
        else if(c==2)return "The Guns of August";
        else if(c==3)return "The Nightingale";
        else if(c==4)return "The Book Thief";
        else return "Invalid";

    }else{
        return "Invalid";
    }

}


    public static void main(String[] args){
        boolean b=true;
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        HashSet<String> set=new HashSet<>();
        while(b){
            System.out.println("press 1 to borrow book");
            System.out.println("press 2 to return book");
            System.out.println("press 3 to look all the borrowed books");
            System.out.println("press 4 to exit");
            int n=sc.nextInt();
            sc.nextLine();
            if(n==1){
                System.out.println("Select Genres you wants to borrow :-");
            }else if(n==2){
                System.out.println("Select Genres you wants to return :-");
            }
            if(n==4)b=false;
            else if(n==3){
                System.out.println(set);
                System.out.println();
            }
            else if(n==1 || n==2){
                System.out.println(" Press 1 for Novel \n Press 2 for Mystery \n Press 3 for Thriller \n Press 4 for Science-Fiction \n Press 5 for History");
                String a="";
                int z=sc.nextInt();
                sc.nextLine();
        
                if(z==1)a="Novel";
                else if(z==2)a="Mystery";
                else if(z==3)a="Thriller";
                else if(z==4)a="Science-Fiction";
                else if(z==5)a="History";
                else{
                    System.out.println("Invalid Input");
                }
                switch (n) {
                    case 1:
                        System.out.println("Select the book name you want to borrow :-");
                        String y=find(a);
                        set.add(y);
                        lib.borrow(a,y);
                        System.out.println("your book " + y + " of genres "+ a + " has been successfully borrowed");
                        System.out.println();
                        break;
        
                    case 2:
                        System.out.println("Select the book name you want to return");
                        String x=find(a);
                        if(set.contains(x)){
                            lib.returnBook(a, x);
                            set.remove(x);
                            System.out.println("Your book has been successfully returned");
                            System.out.println();

                        }else{
                            System.out.println("This book is not the book you borrowed");
                            System.out.println();

                        }
                        break;

                    default:
                        break;
                }
            }else {
                System.out.println("Invalid Input");
            }
        }
    }
}
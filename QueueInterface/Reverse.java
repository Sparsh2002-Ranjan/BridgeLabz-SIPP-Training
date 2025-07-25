import java.util.*;

public class Reverse{

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("how many  elements are there in queue");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt());
        }

        reverse(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }

    static void reverse(Queue<Integer> queue) {
        if (queue.isEmpty()) return;

        int val = queue.remove();
        reverse(queue);
        queue.add(val);
    }
}
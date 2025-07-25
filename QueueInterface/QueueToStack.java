import java.util.*;

class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) q2.add(q1.remove());
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
    }

    public int pop() { return q1.remove(); }

    public int top() { return q1.element(); }

    public boolean empty() { return q1.isEmpty(); }
}

public class QueueToStack {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements are there in queue");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        System.out.println("first element is :- ");
        System.out.println(st.pop());
    }
}

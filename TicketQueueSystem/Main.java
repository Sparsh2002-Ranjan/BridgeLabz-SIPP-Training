import java.util.*;

class Customer {
    private int ticketId;
    private String eventName;
    private String customerName;

    public Customer(int ticketId, String eventName, String customerName) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.customerName = customerName;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "TicketID: " + ticketId + ", Event: " + eventName + ", Customer: " + customerName;
    }
}

class BookingQueue<T> {
    private Queue<T> queue;

    public BookingQueue() {
        queue = new LinkedList<>();
    }

    public void addBooking(T item) {
        queue.offer(item);
    }

    public T serveNext() {
        return queue.poll(); 
    }

    public T peekNext() {
        return queue.peek(); 
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookingQueue<Customer> eventQueue = new BookingQueue<>();
        int tId=1;
        boolean b=true;
        while(b){
            System.out.println("press 1 for booking tickets");
            System.out.println("press 2 to look the details of next customer");
            System.out.println("press 3 to serve next customer");
            System.out.println("press 4 to exit");
            int n=sc.nextInt();
            if(n>0 && n<5){
                switch (n) {
                    case 1:
                        System.out.println("Write your Name");
                        sc.nextLine();
                        String csName=sc.nextLine();
                        System.out.println("press 1 :- Rock Concert");
                        System.out.println("press 2 :- Tech Conference");
                        System.out.println("press 3 :- Comedy Night");
                        System.out.println("press 4 :- Movie Ticket");
                        // sc.nextLine();
                        int y=sc.nextInt();
                        switch (y) {
                            case 1:
                                eventQueue.addBooking(new Customer(tId, "Rock Concert", csName));
                                System.out.println("customer added :- " + "\n     Customer Id : " + tId + "\n     Name : " + csName + "\n     Event Name :- Rock Concert");
                                System.out.println();
                                tId++;
                                break;
                        
                            case 2:
                                eventQueue.addBooking(new Customer(tId, "Tech Conference", csName));
                                System.out.println("customer added :- " + "\n     Customer Id : " + tId + "\n     Name : " + csName + "\n     Event Name :- Tech Conference");
                                System.out.println();
                                tId++;
                                break;

                            case 3:
                                eventQueue.addBooking(new Customer(tId, "Comedy Night", csName));
                                System.out.println("customer added :- " + "\n    Customer Id : " + tId + "\n     Name : " + csName + "\n     Event Name :- Comedy Night");
                                System.out.println();
                                tId++;
                                break;

                            case 4:
                                eventQueue.addBooking(new Customer(tId, "Movie Ticket", csName));
                                System.out.println("customer added :- " + "\n     Customer Id : " + tId + "\n     Name : " + csName + "\n     Event Name :- Movie Ticket");
                                System.out.println();
                                tId++;
                                break;

                            default:
                                break;
                        }
                        
                        break;

                    case 2:
                        if(eventQueue.isEmpty()) System.out.println("There is no next Customer right now");
                        else System.out.println("Next to be served: " + eventQueue.peekNext());
                        break;

                    case 3:
                        if(eventQueue.isEmpty()) System.out.println("There is no Customer right now");
                        else System.out.println("Serving: " + eventQueue.serveNext());
                        break;

                    case 4:
                        b=false;
                        break;

                    default:
                        break;
                }
            }
        }
    }
}

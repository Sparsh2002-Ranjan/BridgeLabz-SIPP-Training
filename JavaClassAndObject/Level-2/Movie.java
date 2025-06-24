class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket() {
        this.movieName = "";
        this.seatNumber = "";
        this.price = 0.0;
        this.isBooked = false;
    }

    public void bookTicket(String movieName, String seatNumber, double price) {
        if (!isBooked) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully.");
        } else {
            System.out.println("Ticket already booked!");
        }
    }

    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: ₹" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}

public class Movie {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();

        ticket1.bookTicket("Inception", "A10", 250.00);
        
        System.out.println();
        ticket1.displayTicketDetails();

        System.out.println();
        ticket1.bookTicket("Avatar", "B5", 300.00);
    }
}

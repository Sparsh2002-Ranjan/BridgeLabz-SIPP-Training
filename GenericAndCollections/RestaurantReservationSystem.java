import java.util.*;

class Reservation {
    private String customerName;
    private int tableNumber;
    private String reservationTime;

    public Reservation(String customerName, int tableNumber, String reservationTime) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
        this.reservationTime = reservationTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    @Override
    public String toString() {
        return "[Customer: " + customerName + ", Table: " + tableNumber + ", Time: " + reservationTime + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Reservation)) return false;
        Reservation other = (Reservation) obj;
        return this.tableNumber == other.tableNumber &&
               this.reservationTime.equals(other.reservationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableNumber, reservationTime);
    }
}

class ReservationManager<T extends Reservation> {
    private List<T> reservations = new ArrayList<>();
    private Set<T> reservationSet = new HashSet<>();

    public void addReservation(T reservation) {
        if (!reservationSet.contains(reservation)) {
            reservations.add(reservation);
            reservationSet.add(reservation);
            System.out.println("Reservation added.");
        } else {
            System.out.println("Duplicate reservation for same table and time.");
        }
    }

    public void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            System.out.println("Upcoming Reservations:");
            for (T res : reservations) {
                System.out.println(res);
            }
        }
    }
}

class CityBranchReservation extends Reservation {
    private String branchName;

    public CityBranchReservation(String customerName, int tableNumber, String reservationTime, String branchName) {
        super(customerName, tableNumber, reservationTime);
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Branch: " + branchName;
    }
}

public class RestaurantReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReservationManager<CityBranchReservation> manager = new ReservationManager<>();

        boolean running = true;
        while (running) {
            System.out.println("\n--- Restaurant Table Reservation System ---");
            System.out.println("1. Add Reservation");
            System.out.println("2. View Reservations");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Table Number: ");
                    int table = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Reservation Time (e.g. 7PM): ");
                    String time = sc.nextLine();

                    System.out.print("Enter Branch Name: ");
                    String branch = sc.nextLine();

                    CityBranchReservation reservation = new CityBranchReservation(name, table, time, branch);
                    manager.addReservation(reservation);
                    break;

                case 2:
                    manager.viewReservations();
                    break;

                case 3:
                    running = false;
                    System.out.println("Thank you. Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

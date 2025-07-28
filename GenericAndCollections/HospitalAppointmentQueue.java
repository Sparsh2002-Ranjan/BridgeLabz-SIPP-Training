import java.util.*;

class Appointment {
    private final String patientName;
    private final String doctorName;
    private final String timeSlot;

    public Appointment(String patientName, String doctorName, String timeSlot) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.timeSlot = timeSlot;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "[Patient: " + patientName + ", Doctor: " + doctorName + ", Time: " + timeSlot + "]";
    }
}

class LabTestRequest {
    private final String patientName;
    private final String testType;
    private final String timeSlot;

    public LabTestRequest(String patientName, String testType, String timeSlot) {
        this.patientName = patientName;
        this.testType = testType;
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "[Patient: " + patientName + ", Test: " + testType + ", Time: " + timeSlot + "]";
    }
}

class GenericQueue<T> {
    private final Queue<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        queue.offer(item);
    }

    public T dequeue() {
        return queue.poll();
    }

    public T peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public List<T> asList() {
        return new ArrayList<>(queue);
    }
}

public class HospitalAppointmentQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericQueue<Appointment> appointments = new GenericQueue<>();
        boolean run = true;
        while (run) {
            System.out.println("\n1. Add appointment");
            System.out.println("2. Serve next (FIFO)");
            System.out.println("3. View next appointment");
            System.out.println("4. View all pending appointments");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = safeInt(sc);
            switch (choice) {
                case 1:
                    System.out.print("Patient name: ");
                    String p = sc.next();
                    System.out.print("Doctor name: ");
                    String d = sc.next();
                    System.out.print("Time slot: ");
                    String t = sc.next();
                    appointments.enqueue(new Appointment(p, d, t));
                    System.out.println("Appointment added");
                    break;
                case 2:
                    Appointment served = appointments.dequeue();
                    if (served == null) {
                        System.out.println("No appointments to serve");
                    } else {
                        System.out.println("Serving: " + served);
                    }
                    break;
                case 3:
                    Appointment next = appointments.peek();
                    if (next == null) {
                        System.out.println("No next appointment");
                    } else {
                        System.out.println("Next: " + next);
                    }
                    break;
                case 4:
                    List<Appointment> list = appointments.asList();
                    if (list.isEmpty()) {
                        System.out.println("No pending appointments");
                    } else {
                        for (Appointment a : list) {
                            System.out.println(a);
                        }
                    }
                    break;
                case 5:
                    run = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }

    private static int safeInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter a valid number: ");
        }
        return sc.nextInt();
    }
}

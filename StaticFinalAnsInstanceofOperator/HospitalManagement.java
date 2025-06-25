class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    final int patientID;

    String name;
    int age;
    String ailment;

    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayPatientDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("-----------------------------");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient(201, "Neha", 30, "Flu");
        Patient p2 = new Patient(202, "Raj", 45, "Fracture");

        if (p1 instanceof Patient) {
            p1.displayPatientDetails();
        }

        if (p2 instanceof Patient) {
            p2.displayPatientDetails();
        }

        // Display total admitted patients
        Patient.getTotalPatients();
    }
}

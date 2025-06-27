import java.util.ArrayList;

class Patient {
    String name;
    ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void viewDoctors() {
        System.out.println("Patient: " + name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println("  Dr. " + d.name);
        }
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
    }

    public void viewPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("  Patient: " + p.name);
        }
    }
}

class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("  Dr. " + d.name);
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("  " + p.name);
        }
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Smith");
        Doctor d2 = new Doctor("Jones");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);

        System.out.println();
        d1.viewPatients();
        System.out.println();
        d2.viewPatients();
        System.out.println();
        p1.viewDoctors();
        System.out.println();
        p2.viewDoctors();
    }
}

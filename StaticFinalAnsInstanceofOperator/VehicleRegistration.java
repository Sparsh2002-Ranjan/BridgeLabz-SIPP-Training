class Vehicle {
    static double registrationFee = 5000.0;

    final String registrationNumber;

    String ownerName;
    String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicleDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
        System.out.println("-----------------------------");
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("RJ01AB1234", "Arjun", "Car");
        Vehicle v2 = new Vehicle("MH12CD5678", "Sneha", "Scooter");

        if (v1 instanceof Vehicle) {
            v1.displayVehicleDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayVehicleDetails();
        }

        Vehicle.updateRegistrationFee(6000.0);
        System.out.println("Updated Registration Fee Applied:\n");

        if (v1 instanceof Vehicle) {
            v1.displayVehicleDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayVehicleDetails();
        }
    }
}

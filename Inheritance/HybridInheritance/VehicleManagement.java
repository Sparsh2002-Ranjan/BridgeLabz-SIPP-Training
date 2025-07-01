interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println("Charging electric vehicle...");
    }

    void displayInfo() {
        System.out.println("Type: Electric Vehicle");
        displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        charge();
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelTankCapacity;

    PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
    }

    void displayInfo() {
        System.out.println("Type: Petrol Vehicle");
        displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
        refuel();
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 40);

        ev.displayInfo();
        System.out.println();
        pv.displayInfo();
    }
}

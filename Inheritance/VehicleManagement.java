import java.util.*; 

abstract class Vehicle {
    private String brand;
    private String model;
    private String fuelType; 
    private int cost;

    public Vehicle(String brand,String model,String fuelType,int cost){
        this.brand=brand;
        this.model=model;
        this.fuelType=fuelType;
        this.cost=cost;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public String getFuelType(){
        return fuelType;
    }
    public int getCost(){
        return cost;
    }
    public void getItemDetails(){
        System.out.println("Brand : " + brand);
        System.out.println("Model : "+ model);
        System.out.println("FuelType : " + fuelType);
    }
    
    public abstract int calculateServiceCost(int a);

}

class Car extends Vehicle{

    public Car(String brand, String model, String fuelType, int cost) {
        super(brand, model, fuelType, cost);
    }
    @Override
    public int calculateServiceCost(int a) {
        return getCost()*2+5000;
    }
    
}

class Bike extends Vehicle{

    public Bike(String brand, String model, String fuelType, int cost) {
        super(brand, model, fuelType, cost);
    }
    @Override
    public int calculateServiceCost(int a) {
        return (getCost()*1)+7000;
    }

}

class Truck extends Vehicle{

    public Truck(String brand, String model, String fuelType, int cost) {
        super(brand, model, fuelType, cost);
    }
    @Override
    public int calculateServiceCost(int a) {
        return (getCost()*3)+4000;
    }
}


public class VehicleManagement {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Maruti Suzuki","y900-2z","petrol",50000));
        vehicles.add(new Bike("Honda","uaj-92u","petrol",40000));
        vehicles.add(new Truck("Tata","qdjk0-2z","petrol",90000));

        

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getBrand() + " | Model: " + v.getModel() + "| FuelType: "+v.getFuelType());
            int price = v.calculateServiceCost(v.getCost());
            System.out.println("Price: "+ price);
            System.out.println();
        }
    }
}
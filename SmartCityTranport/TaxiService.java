public class TaxiService implements TransportService {
    private String name;
    private int capacity;
    private double fare;
    public TaxiService(String name,int capacity,double fare){ this.name=name;this.capacity=capacity;this.fare=fare; }
    public String getName(){ return name; }
    public int getCapacity(){ return capacity; }
    public double getFare(){ return fare; }
}

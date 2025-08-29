public interface TransportService {
    String getName();
    int getCapacity();
    double getFare();

    default void printServiceDetails() {
        System.out.println(getName() + " | Capacity: " + getCapacity() + " | Fare: " + getFare());
    }
}

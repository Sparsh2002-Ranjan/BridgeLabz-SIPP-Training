interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Role: Chef");
        displayInfo();
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Prepares meals and manages the kitchen.");
    }
}

class Waiter extends Person implements Worker {
    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    public void performDuties() {
        System.out.println("Role: Waiter");
        displayInfo();
        System.out.println("Tables Assigned: " + tableCount);
        System.out.println("Duties: Serves customers and handles orders.");
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Chef chef = new Chef("Arjun", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Priya", 202, 5);

        chef.performDuties();
        System.out.println();
        waiter.performDuties();
    }
}

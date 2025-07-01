class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("Role: Manager");
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("Role: Developer");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String mentorName;

    Intern(String name, int id, double salary, String mentorName) {
        super(name, id, salary);
        this.mentorName = mentorName;
    }

    @Override
    void displayDetails() {
        System.out.println("Role: Intern");
        super.displayDetails();
        System.out.println("Mentor: " + mentorName);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager("Aditi", 101, 90000, 8);
        Developer d = new Developer("Rohan", 102, 75000, "Java");
        Intern i = new Intern("Megha", 103, 20000, "Aditi");

        m.displayDetails();
        System.out.println();
        d.displayDetails();
        System.out.println();
        i.displayDetails();
    }
}

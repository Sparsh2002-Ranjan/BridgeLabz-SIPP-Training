class Employee {
    static String companyName = "TechNova Solutions";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(int id, String name, String designation) {
        this.id = id;  
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("--------------------------");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ananya", "Software Engineer");
        Employee emp2 = new Employee(102, "Rahul", "UI Designer");

        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }

        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }

        Employee.displayTotalEmployees();
    }
}

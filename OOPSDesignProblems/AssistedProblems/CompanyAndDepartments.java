import java.util.ArrayList;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("    Employee: " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    public void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    public void display() {
        System.out.println("  Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addEmployeeToDepartment(String deptName, String empName) {
        for (Department d : departments) {
            if (d.deptName.equals(deptName)) {
                d.addEmployee(empName);
                return;
            }
        }
    }

    public void display() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.display();
        }
    }

    public void deleteCompany() {
        departments.clear(); 
        System.out.println("Company '" + companyName + "' and all its departments/employees deleted.");
    }
}

public class  CompanyAndDepartments {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("IT", "Alice");
        company.addEmployeeToDepartment("IT", "Bob");
        company.addEmployeeToDepartment("HR", "Carol");

        company.display();

        System.out.println("\nDeleting company...\n");
        company.deleteCompany();
    }
}

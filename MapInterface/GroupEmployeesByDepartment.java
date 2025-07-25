import java.util.*;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {
    public static class Employee {
        private final String name;
        private final String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public String toString() {
            return name;
        }
    }

    public static Map<String, List<Employee>> group(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    }

    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );
        System.out.println(group(list));
    }
}

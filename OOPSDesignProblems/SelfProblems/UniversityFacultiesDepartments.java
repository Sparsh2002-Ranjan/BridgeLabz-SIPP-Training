import java.util.ArrayList;

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void display() {
        System.out.println("  Department: " + deptName);
    }
}

class University {
    String universityName;
    ArrayList<Department> departments;
    ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty); 
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.display();
        }

        System.out.println("Faculty Members:");
        for (Faculty f : faculties) {
            f.display();
        }
    }

    public void deleteUniversity() {
        departments.clear(); 
        System.out.println("University '" + universityName + "' and its departments deleted.");
    }
}

public class  UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University uni = new University("Global Tech University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Johnson");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversity();

        System.out.println("\nDeleting university...\n");
        uni.deleteUniversity();

        System.out.println("Faculty members still exist:");
        f1.display();
        f2.display();
    }
}

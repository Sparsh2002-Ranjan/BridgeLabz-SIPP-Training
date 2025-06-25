class Student {
    static String universityName = "Global Tech University";
    static int totalStudents = 0;

    final int rollNumber;
    
    String name;
    String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("-----------------------------");
    }

    void updateGrade(String newGrade) {
        this.grade = newGrade;
    }
}

public class UniversityStudents {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Meera", "A");
        Student s2 = new Student(102, "Ravi", "B");

        if (s1 instanceof Student) {
            s1.displayStudentDetails();
        }

        if (s2 instanceof Student) {
            s2.displayStudentDetails();
        }

        if (s2 instanceof Student) {
            s2.updateGrade("A+");
            System.out.println("Updated Grade for Ravi:");
            s2.displayStudentDetails();
        }

        Student.displayTotalStudents();
    }
}

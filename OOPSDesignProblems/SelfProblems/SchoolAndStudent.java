import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollCourse(this); // Maintain two-way association
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("  Student: " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Maintain two-way association
        }
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println("  Enrolled in: " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("  Student: " + s.name);
        }
    }
}

public class SchoolAndStudent {
    public static void main(String[] args) {
        School school = new School("Green Valley High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c1);

        school.displayStudents();
        System.out.println();

        s1.viewCourses();
        System.out.println();
        s2.viewCourses();
        System.out.println();

        c1.displayEnrolledStudents();
        System.out.println();
        c2.displayEnrolledStudents();
    }
}

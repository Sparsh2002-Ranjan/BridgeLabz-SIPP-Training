import java.util.ArrayList;

class Student {
    String name;
    ArrayList<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this);
            System.out.println(name + " enrolled in " + course.courseName);
        }
    }

    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println("  - " + c.courseName);
        }
    }
}

class Professor {
    String name;
    ArrayList<Course> teachingCourses;

    public Professor(String name) {
        this.name = name;
        teachingCourses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        if (!teachingCourses.contains(course)) {
            teachingCourses.add(course);
            course.setProfessor(this);
            System.out.println("Professor " + name + " assigned to " + course.courseName);
        }
    }

    public void viewCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        for (Course c : teachingCourses) {
            System.out.println("  - " + c.courseName);
        }
    }
}

class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void viewDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("  Taught by: " + (professor != null ? professor.name : "No professor assigned"));
        System.out.println("  Enrolled Students:");
        for (Student s : students) {
            System.out.println("    - " + s.name);
        }
    }
}

class University {
    String name;
    ArrayList<Student> students;
    ArrayList<Professor> professors;
    ArrayList<Course> courses;

    public University(String name) {
        this.name = name;
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void viewUniversity() {
        System.out.println("University: " + name);
        System.out.println("Students:");
        for (Student s : students) System.out.println("  - " + s.name);
        System.out.println("Professors:");
        for (Professor p : professors) System.out.println("  - " + p.name);
        System.out.println("Courses:");
        for (Course c : courses) System.out.println("  - " + c.courseName);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        University uni = new University("Global University");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addProfessor(p2);
        uni.addCourse(c1);
        uni.addCourse(c2);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        System.out.println();
        s1.viewCourses();
        System.out.println();
        p1.viewCourses();
        System.out.println();
        c1.viewDetails();
        System.out.println();
        uni.viewUniversity();
    }
}

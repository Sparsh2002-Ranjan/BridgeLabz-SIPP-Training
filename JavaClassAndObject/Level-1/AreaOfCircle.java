class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Radius of the circle: " + radius);
        System.out.println("Area of the circle: " + calculateArea());
        System.out.println("Circumference of the circle: " + calculateCircumference());
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(7.5);

        circle1.displayDetails();
    }
}

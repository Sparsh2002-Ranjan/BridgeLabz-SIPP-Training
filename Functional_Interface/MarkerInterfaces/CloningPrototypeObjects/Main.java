class Prototype implements Cloneable {
    String name;
    Prototype(String name) { this.name = name; }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype("Model 1");
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Cloned: " + p2.name);
    }
}
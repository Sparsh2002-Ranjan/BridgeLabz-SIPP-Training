class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird says: Tweet!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Bruno", 4);
        Animal cat = new Cat("Whiskers", 3);
        Animal bird = new Bird("Tweety", 2);

        dog.displayInfo();
        dog.makeSound();
        System.out.println();

        cat.displayInfo();
        cat.makeSound();
        System.out.println();

        bird.displayInfo();
        bird.makeSound();
    }
}


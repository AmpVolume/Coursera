// ================== INTERFACE EXAMPLE ==================

interface Animal {
    void sound(); // must be implemented
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}


// ================== ABSTRACT CLASS EXAMPLE ==================

abstract class Shape {
    // abstract method (must be implemented)
    abstract void draw();

    // concrete method (already implemented)
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}


// ================== MAIN CLASS ==================

public class Main {
    public static void main(String[] args) {

        System.out.println("=== INTERFACE (POLYMORPHISM) ===");

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound(); // Bark
        cat.sound(); // Meow


        System.out.println("\n=== ABSTRACT CLASS ===");

        Shape shape = new Circle();

        shape.draw();    // overridden method
        shape.display(); // inherited method
    }
}

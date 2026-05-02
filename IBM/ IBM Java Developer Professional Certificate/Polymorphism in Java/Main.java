class MathOperations {

    // Method 1: two ints
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: three ints
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: two doubles
    double add(double a, double b) {
        return a + b;
    }
}


// Runtime polymorphism classes
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


// MAIN CLASS (ENTRY POINT)
public class Main {

    public static void main(String[] args) {

        System.out.println("=== COMPILE-TIME POLYMORPHISM ===");

        MathOperations math = new MathOperations();

        System.out.println("Sum of 2 and 3: " + math.add(2, 3));
        System.out.println("Sum of 2, 3, 4: " + math.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));


        System.out.println("\n=== RUNTIME POLYMORPHISM ===");

        Animal a;

        a = new Animal();
        a.sound();

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}

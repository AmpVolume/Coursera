class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " says woof!");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println(name + " says meow!");
    }

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println(name + " is weeping.");
    }
}

public class Main {
    public static void main(String[] args) {
       
        //============ BASIC INHERITANCE ============//
        System.out.println("=== BASIC INHERITANCE ===");
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();
        myDog.bark();
        
        //============= MULTILEVEL INHERITANCE =============//
        System.out.println("\n=== MULTILEVEL INHERITANCE ===");
        Puppy myPuppy = new Puppy();
        myPuppy.name = "Max";
        myPuppy.eat();
        myPuppy.bark();
        myPuppy.weep();
        //============= HIERARCHICAL INHERITANCE =============//
        System.out.println("\n=== HIERARCHICAL INHERITANCE ===");
        Cat myCat = new Cat();
        myCat.name = "Whiskers";
        myCat.eat();
        myCat.meow();

        //============= POLYMORPHISM =============//
        System.out.println("\n=== POLYMORPHISM ===");
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Cat();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}

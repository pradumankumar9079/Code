// Base class
class Animal {
    // Method of the base class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    // Method of the derived class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog myDog = new Dog();

        // Call method from the base class
        myDog.eat();

        // Call method from the derived class
        myDog.bark();
    }
}

// PUBLIC class → accessible from anywhere
public class AccessModifierDemo {

    // PUBLIC variable → accessible from anywhere
    public String name = "Java Demo";

    // FINAL variable → cannot be changed once assigned
    public final int VERSION = 1;

    // STATIC variable → shared by all objects of the class
    public static int objectCount = 0;

    // Constructor
    public AccessModifierDemo() {
        objectCount++; // increase count whenever a new object is created
    }

    // PUBLIC method → accessible anywhere
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Version: " + VERSION);
    }

    // STATIC method → belongs to the class, not objects
    public static void showObjectCount() {
        System.out.println("Objects created: " + objectCount);
    }

    // FINAL method → cannot be overridden in subclasses
    public final void finalMethod() {
        System.out.println("This is a final method. It cannot be overridden.");
    }

    // MAIN method → static + public + void
    // public → JVM can access it
    // static → runs without creating an object
    // void → does not return anything
    public static void main(String[] args) {
        // Creating objects
        AccessModifierDemo obj1 = new AccessModifierDemo();
        AccessModifierDemo obj2 = new AccessModifierDemo();

        // Using public method
        obj1.displayInfo();

        // Using static method (no need for object)
        AccessModifierDemo.showObjectCount();

        // Using final method
        obj1.finalMethod();

        // Demonstrating abstract class
        Animal myDog = new Dog(); // Upcasting (abstract -> concrete)
        myDog.sound();  // Calls overridden method

        // FINAL variable usage
        System.out.println("Final VERSION = " + obj1.VERSION);
        // obj1.VERSION = 2;  This would give an error
    }
}

// ABSTRACT class → cannot be instantiated, only inherited
abstract class Animal {
    // Abstract method → must be implemented by subclasses
    abstract void sound();

    // Non-abstract method → normal method inside abstract class
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass of abstract class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}




/*
C:\Java programs\Assignment 1 main\4>java AccessModifierDemo.java
Name: Java Demo
Version: 1
Objects created: 2
This is a final method. It cannot be overridden.
Dog says: Woof Woof!
Final VERSION = 1
*/
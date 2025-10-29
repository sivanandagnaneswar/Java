// Abstraction Demonstration
// Roll No: CCE22030

abstract class Animal {
    abstract void makeSound();

    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }

    void fetch() {
        System.out.println("Dog is fetching the ball.");
    }
}

public class CCE22030_AbstractionAnimal {
    public static void main(String[] args) {
        System.out.println("Roll No: CCE22030");
        System.out.println("=== ABSTRACTION DEMO USING ANIMAL CLASS ===\n");

        Animal obj = new Dog();
        obj.makeSound();
        obj.eat();
        obj.sleep();

        // Accessing subclass-specific behavior
        Dog pet = new Dog();
        pet.fetch();
    }
}

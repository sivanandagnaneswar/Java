class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class MultilevelExample {
    public static void main(String[] args) {
        Dog labrador = new Dog();
        labrador.eat();
        labrador.walk();
        labrador.bark();
    }
}

abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void move();

    void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    Car(String brand, int speed) {
        super(brand, speed);
    }

    void move() {
        System.out.println(brand + " car is driving on the road.");
    }
}

class Bike extends Vehicle {
    Bike(String brand, int speed) {
        super(brand, speed);
    }

    void move() {
        System.out.println(brand + " bike is racing on the track.");
    }
}

class Airplane extends Vehicle {
    Airplane(String brand, int speed) {
        super(brand, speed);
    }

    void move() {
        System.out.println(brand + " airplane is flying in the sky.");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Tesla", 200);
        Vehicle v2 = new Bike("Yamaha", 150);
        Vehicle v3 = new Airplane("Boeing", 900);

        Vehicle[] transport = {v1, v2, v3};

        for (Vehicle v : transport) {
            v.showDetails();
            v.move();
            System.out.println("-----");
        }
    }
}

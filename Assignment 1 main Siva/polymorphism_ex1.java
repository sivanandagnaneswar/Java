class Device {
    void powerOn() {
        System.out.println("Device is powered ON.");
    }

    void powerOff() {
        System.out.println("Device is powered OFF.");
    }
}

class Laptop extends Device {
    void runProgram() {
        System.out.println("Laptop is running a program.");
    }
}

class Smartphone extends Device {
    void makeCall() {
        System.out.println("Smartphone is making a call.");
    }
}

class Tablet extends Device {
    void browseInternet() {
        System.out.println("Tablet is browsing the internet.");
    }
}

public class DeviceDemo {
    public static void main(String[] args) {
        Laptop hp = new Laptop();
        Smartphone samsung = new Smartphone();
        Tablet ipad = new Tablet();

        hp.powerOn();
        hp.runProgram();
        hp.powerOff();

        samsung.powerOn();
        samsung.makeCall();
        samsung.powerOff();

        ipad.powerOn();
        ipad.browseInternet();
        ipad.powerOff();
    }
}

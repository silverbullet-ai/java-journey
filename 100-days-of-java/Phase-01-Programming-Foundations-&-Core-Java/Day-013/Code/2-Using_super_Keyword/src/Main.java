class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        super.start();
        System.out.println("Car starts with key");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
class Car {
    String brand;
    int speed;
}

public class ObjectDemo {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Lamborghini";
        c1.speed = 350;

        System.out.println("Brand: " + c1.brand);
        System.out.println("Speed: " + c1.speed);
    }
}
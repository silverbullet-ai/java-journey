abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class Practice {
    public static void main(String[] args) {

        Shape s = new Circle(5);
        System.out.println("Area: " + s.area());
    }
}
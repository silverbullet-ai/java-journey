class Display {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(double a) {
        System.out.println("Double: " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        Display d = new Display();

        d.show(10);
        d.show(10.5);
    }
}
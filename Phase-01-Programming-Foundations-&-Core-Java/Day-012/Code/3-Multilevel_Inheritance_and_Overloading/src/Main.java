class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show(int x) {
        System.out.println("Class B: " + x);
    }
}

class C extends B {
    void display() {
        System.out.println("Class C");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();

        obj.show();
        obj.show(10);
        obj.display();
    }
}
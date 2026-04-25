class Demo {

    private int a = 10;
    int b = 20;          // default
    public int c = 30;

    public void show() {
        System.out.println("Private a: " + a);
        System.out.println("Default b: " + b);
        System.out.println("Public c: " + c);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show();

        // System.out.println(d.a); ❌ not accessible
        System.out.println(d.b);    // default
        System.out.println(d.c);    // public
    }
}
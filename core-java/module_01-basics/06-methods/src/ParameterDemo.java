public class ParameterDemo {

    public static void greetUser(String name) {
        System.out.println("Hello " + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        greetUser("Aahish");

        int result = add(5, 3);
        System.out.println("Sum: " + result);
    }
}
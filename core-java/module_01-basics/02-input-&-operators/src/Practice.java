import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        int product = a * b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}
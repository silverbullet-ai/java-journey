import java.util.Scanner;

public class Practice {

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = square(n);

        System.out.println("Square is: " + result);

        sc.close();
    }
}
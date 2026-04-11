import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Check Even/Odd");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter number: ");
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
import java.util.Scanner;

public class LoopIntegration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Print Numbers");
            System.out.println("2. Sum of Even Numbers");
            System.out.println("3. Pattern Printing");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter N: ");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }

            } else if (choice == 2) {
                System.out.print("Enter N: ");
                int n = sc.nextInt();

                int sum = 0;

                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0) {
                        continue; // skip odd numbers
                    }
                    sum += i;
                }

                System.out.println("Sum of even numbers: " + sum);

            } else if (choice == 3) {
                System.out.print("Enter rows: ");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            } else if (choice == 4) {
                break; // exit program
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
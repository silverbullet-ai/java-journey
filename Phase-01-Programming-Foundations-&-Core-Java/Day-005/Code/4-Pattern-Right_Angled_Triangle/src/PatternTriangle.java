import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {        // outer loop (rows)
            for (int j = 1; j <= i; j++) {    // inner loop (columns)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
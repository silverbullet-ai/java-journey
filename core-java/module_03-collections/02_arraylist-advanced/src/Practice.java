import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Traversal
        System.out.println("Elements:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        // Sorting
        Collections.sort(list);
        System.out.println("\nSorted: " + list);

        // Searching
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (list.contains(key)) {
            System.out.println("Found at index: " + list.indexOf(key));
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}
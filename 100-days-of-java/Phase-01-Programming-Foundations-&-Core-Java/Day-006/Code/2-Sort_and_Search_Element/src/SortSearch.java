import java.util.Arrays;
import java.util.Scanner;

public class SortSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 2, 9, 1, 3};

        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = Arrays.binarySearch(arr, key);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
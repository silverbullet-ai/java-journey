public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};

        print(arr);
    }

    public static void print(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
public class ModifyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        modify(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void modify(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }
}
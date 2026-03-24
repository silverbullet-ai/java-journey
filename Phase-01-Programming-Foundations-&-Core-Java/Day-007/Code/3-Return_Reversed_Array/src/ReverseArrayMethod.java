public class ReverseArrayMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] reversed = reverse(arr);

        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverse(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - 1 - i];
        }

        return newArr;
    }
}
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        System.out.println("Original: " + list);

        // Remove even numbers
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--; // adjust index
            }
        }

        System.out.println("After removing evens: " + list);
    }
}
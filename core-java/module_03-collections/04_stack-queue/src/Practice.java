import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {

        // Stack reverse
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }

        System.out.print("Reversed: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        // Queue example
        Queue<String> queue = new LinkedList<>();

        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("\nQueue Processing:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
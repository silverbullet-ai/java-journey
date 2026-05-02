import java.util.LinkedList;

public class OperationsDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("Start");
        list.addLast("End");

        System.out.println("List: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("After removal: " + list);
    }
}
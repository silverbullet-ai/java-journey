import java.util.ArrayList;

public class OperationsDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Original: " + list);

        list.set(1, "JavaScript");
        System.out.println("After update: " + list);

        list.remove(2);
        System.out.println("After remove: " + list);

        System.out.println("Size: " + list.size());
    }
}
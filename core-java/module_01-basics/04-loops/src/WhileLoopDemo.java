public class WhileLoopDemo {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 3) {
            System.out.println("While: " + i);
            i++;
        }

        int j = 1;

        do {
            System.out.println("Do-While: " + j);
            j++;
        } while (j <= 3);
    }
}
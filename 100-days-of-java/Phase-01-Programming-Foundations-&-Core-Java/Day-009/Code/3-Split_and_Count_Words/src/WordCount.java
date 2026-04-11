import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine().trim();

        String[] words = str.split(" ");

        System.out.println("Number of words: " + words.length);
    }
}
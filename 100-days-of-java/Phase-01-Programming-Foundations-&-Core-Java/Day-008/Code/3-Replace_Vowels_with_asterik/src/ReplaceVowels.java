import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        str = str.replaceAll("[aeiouAEIOU]", "*");

        System.out.println("Modified string: " + str);
    }
}
class Book {
    String title;
    String author;
}

public class Practice {
    public static void main(String[] args) {

        Book b1 = new Book();

        b1.title = "Java Basics";
        b1.author = "Aahish";

        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
    }
}
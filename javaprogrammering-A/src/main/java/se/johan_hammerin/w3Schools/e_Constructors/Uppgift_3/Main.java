package se.johan_hammerin.w3Schools.e_Constructors.Uppgift_3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Ett hål om dagen", "Någon vis");
        System.out.println("title = " + book.getTitle() + "\nauthor = " + book.getAuthor());
    }
}

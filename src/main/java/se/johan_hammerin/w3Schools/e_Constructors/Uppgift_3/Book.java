package se.johan_hammerin.w3Schools.e_Constructors.Uppgift_3;

public class Book {
    private String title;
    private String author;

    //Constructor
    Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
    }

    //getters & setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

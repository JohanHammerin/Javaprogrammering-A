package se.johan_hammerin.w3Schools.b_Classes_and_Objects.Uppgift_4;

public class Book {
    private String title;

    //Constructor
    Book(String title) {
        setTitle(title);
    }

    //Getters & Setters
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

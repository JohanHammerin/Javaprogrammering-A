package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_5;

public class Book {

    private String title;
    private String author;
    private double price;

    //Constructor
    public Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
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

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Priset kan inte vara negativt");
        } else {
            this.price = price;
        }
    }

    //toString
    @Override
    public String toString() {
        return "title = " + getTitle() + "\n" +
                "author = " + getAuthor() + "\n" +
                "price = " + getPrice() + " kr";
    }
}

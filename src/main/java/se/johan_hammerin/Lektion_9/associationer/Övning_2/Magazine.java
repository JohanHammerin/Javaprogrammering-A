package se.johan_hammerin.Lektion_9.associationer.Övning_2;

public class Magazine {
    private String name;
    private double price;
    private Publisher publisher;

    //Constructor
    public Magazine(String name, double price, Publisher publisher) {
        setName(name);
        setPrice(price);
        setPublisher(publisher);
    }

    //Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}

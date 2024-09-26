package se.johan_hammerin.Lektion_6.Parprogrammering;

public class Product {
    private String name;
    private double price;

    //Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    //getters
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
}

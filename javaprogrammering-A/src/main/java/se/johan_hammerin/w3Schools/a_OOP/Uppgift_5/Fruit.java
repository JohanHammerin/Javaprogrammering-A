package se.johan_hammerin.w3Schools.a_OOP.Uppgift_5;

public class Fruit {
    private String type;

    //Constructor
    Fruit(String type) {
        setType(type);
    }

    //Methods
    public void describe() {
        System.out.println(getClass().getSimpleName() + " is " + getType());
    }

    //Getters & Setters
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

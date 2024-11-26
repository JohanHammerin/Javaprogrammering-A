package se.johan_hammerin.w3Schools.b_Classes_and_Objects.Uppgift_3;

public class Animal {
    private String type;

    //Constructor
    Animal(String type) {
        setType(type);
    }

    //Getters & Setters
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

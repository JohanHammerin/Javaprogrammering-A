package se.johan_hammerin.w3Schools.b_Classes_and_Objects.Uppgift_2;

public class Car {
    private String colour;

    //Constructor
    Car(String colour) {
        setColour(colour);
    }

    //Getters & Setters
    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

package se.johan_hammerin.w3Schools.e_Constructors.Uppgift_1;

public class Animal {
    private String name;

    //Constructors
    Animal() {
        setName("Unknown");
    }

    //Getters & Setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

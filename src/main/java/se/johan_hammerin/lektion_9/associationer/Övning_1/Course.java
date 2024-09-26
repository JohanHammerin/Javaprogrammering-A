package se.johan_hammerin.lektion_9.associationer.Övning_1;

public class Course {
    private String name;

    //Constructor
    public Course(String name) {
        setName(name);
    }

    //Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

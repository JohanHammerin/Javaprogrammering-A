package se.johan_hammerin.w3Schools.c_Class_Attributes.Uppgift_5;

public class Person {
    private String firstName;
    private String lastName;
    private int grade;


    //Constructor
    Person(String firstName, String lastName, int grade) {
        setFirstName(firstName);
        setLastName(lastName);
        setGrade(grade);
    }


    //getters & setters
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

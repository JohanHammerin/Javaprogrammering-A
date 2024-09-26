package se.johan_hammerin.w3Schools.e_Constructors.Uppgift_5;

public class Student {
    private String name;
    private int grade;

    //Constructors
    Student() {
        setName("No Name");
        setGrade(0);
    }

    Student(String name, int grade) {
        setName(name);
        setGrade(grade);
    }

    //getters & setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return this.grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}

package se.johan_hammerin.w3Schools.e_Constructors.Uppgift_2;

public class Person {
    private int age;


    //Constructor
    Person(int age) {
        setAge(age);
    }

    //Getters & Setters
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

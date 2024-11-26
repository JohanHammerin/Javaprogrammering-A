package se.johan_hammerin.lektion_3.oop;

public class Person {
    private String name;
    private int age;
    private String city;


    //Constructors
    public Person(String name, int age, String city) {
        setName(name);
        setAge(age);
        setCity(city);
    }


    //Methods
    public void introduce() {
        System.out.println("Namn: " + getName() + "\nÅlder: " + getAge() + "\nStad: " + getCity());
    }


    //Setters & Getters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }
}

package se.johan_hammerin.Lektion_6.Övning_1;

public class Person {
    private String name;
    private int age;
    private String job;

    //Constructor
    Person(String name, int age, String job) {
        setName(name);
        setAge(age);
        setJob(job);
    }


    //getters & setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Namn: [" + getName() + "], Ålder: [" + getAge() + "], Yrke: [" + getJob() + "]";
    }

}

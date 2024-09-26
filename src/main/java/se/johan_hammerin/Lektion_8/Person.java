package se.johan_hammerin.Lektion_8;

abstract class Person {
    protected String name;
    protected int age;

    //Methods
    public void introduce() {
        System.out.println(getName() + " " + getAge());
    }

    abstract void work();

    //Getters & Setters
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
}

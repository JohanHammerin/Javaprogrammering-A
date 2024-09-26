package se.johan_hammerin.w3Schools.i_Inheritance.Uppgift_2;

abstract class Person {
    private String name;

    //getter & setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString
    @Override
    public String toString() {
        return "name:" + getName();
    }
}

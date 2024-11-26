package se.johan_hammerin.w3Schools.i_Inheritance.Uppgift_3;

public class Employee {
    //Attributes
    private double salary;

    //Constructor
    Employee(double salary) {
        setSalary(salary);
    }

    //Getters & Setters
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

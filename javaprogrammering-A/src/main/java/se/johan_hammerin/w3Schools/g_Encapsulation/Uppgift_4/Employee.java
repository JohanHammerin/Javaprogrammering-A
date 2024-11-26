package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_4;

public class Employee {


    private int employeID;
    private String name;
    private double salary;


    //methods
    public void giveRaise() {
        setSalary(getSalary() * 1.05);
    }

    //getters & setters
    public int getEmployeID() {
        return this.employeID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary < 20_000) {
            System.out.println("Lönen kan inte vara lägre än 20 000kr");
        } else {
            this.salary = salary;
        }
    }

    //toString
    @Override
    public String toString() {
        return "employeeID = " + getEmployeID() + "\n" +
                "name = " + getName() + "\n" +
                "salary = " + getSalary() + " kr";
    }

}

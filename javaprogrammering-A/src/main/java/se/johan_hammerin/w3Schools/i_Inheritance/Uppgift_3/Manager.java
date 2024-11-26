package se.johan_hammerin.w3Schools.i_Inheritance.Uppgift_3;

public class Manager extends Employee {
    //Attributes
    private String department;

    Manager(double salary, String department) {
        super(salary);
        setDepartment(department);
    }

    //Getter & Setter
    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //toString
    public String toString() {
        return "salary:" + getSalary() + "\n" +
                "department:" + getDepartment();
    }
}

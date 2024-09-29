package se.johan_hammerin.w3Schools.l_Abstraction.Uppgift_5;

public class Developer extends Employee {
    //Method
    @Override
    public void calculateSalary() {
        System.out.println(10_000 * 1.10);
    }
}

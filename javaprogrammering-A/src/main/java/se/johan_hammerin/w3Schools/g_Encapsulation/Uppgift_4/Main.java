package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_4;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Johan");
        employee.setSalary(20_000);
        employee.giveRaise();
        System.out.println(employee);
    }
}

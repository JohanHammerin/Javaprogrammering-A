package se.johan_hammerin.w3Schools.l_Abstraction.Uppgift_5;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        Developer developer = new Developer();

        manager.work();
        manager.calculateSalary();

        developer.work();
        developer.calculateSalary();
    }
}

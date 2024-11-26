package se.johan_hammerin.w3Schools.c_Class_Attributes.Uppgift_5;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", "Johnsson", 90);
        System.out.println("firstName = "+ person.getFirstName() + "\nlastName = " + person.getLastName() + "\ngrade = " + person.getGrade());
    }
}

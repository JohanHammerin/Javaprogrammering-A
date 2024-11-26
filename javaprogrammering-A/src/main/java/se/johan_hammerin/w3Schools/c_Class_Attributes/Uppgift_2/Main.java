package se.johan_hammerin.w3Schools.c_Class_Attributes.Uppgift_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getAge());

        person.setAge(33);
        System.out.println(person.getAge());
    }
}

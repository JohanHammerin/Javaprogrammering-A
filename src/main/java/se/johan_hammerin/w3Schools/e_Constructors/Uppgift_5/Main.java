package se.johan_hammerin.w3Schools.e_Constructors.Uppgift_5;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student("Johan",100);

        System.out.println("firstStudent = "+ firstStudent.getName() + " " + firstStudent.getGrade());
        System.out.println("secondStudent = "+ secondStudent.getName() + " " + secondStudent.getGrade());

    }
}

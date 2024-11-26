package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentID(100);
        student.setName("Johan");
        student.setGrade(21);

        System.out.println(student);
    }
}

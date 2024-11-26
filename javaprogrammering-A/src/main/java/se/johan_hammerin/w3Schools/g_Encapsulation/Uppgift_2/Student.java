package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_2;

public class Student {
    private int studentID;
    private String name;
    private double grade;

    //getters & setter
    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Ogiltig inmatning på betyg");
        } else {
            this.grade = grade;
        }
    }

    //toString
    @Override
    public String toString() {
        return ("studentID = " + getStudentID() + "\n" +
                "name = " + getName() + "\n" +
                "grade = " + getGrade());
    }
}

package se.johan_hammerin.w3Schools.i_Inheritance.Uppgift_2;

public class Student extends Person {
    private int studentID;

    //Constructor
    Student(String name, int studentID) {
        setName(name);
        setStudentID(studentID);
    }

    //Getter & Setter
    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "studentID:" + getStudentID();
    }
}

package se.johan_hammerin.Lektion_8;

public class Student extends Person {
    private int studentID;
    private Teacher teacher;

    //Constructor
    public Student(String name, int age, int studentID) {
        setName(name);
        setAge(age);
        setStudentID(studentID);
    }

    //Methods
    @Override
    public void introduce() {
        System.out.print(getName() + " " + getAge() + " " + getStudentID());
    }

    @Override
    public void work() {
        System.out.println(getName() + " is studying");
    }

    public void study() {
        System.out.println(getName() + " studerar");
    }

    public void getTeacherInfo(Teacher teacher) {
        teacher.introduce();
    }

    //Getter & Setter
    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

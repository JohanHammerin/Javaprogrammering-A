package se.johan_hammerin.Lektion_8;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Johan",20,1);
        Teacher teacher = new Teacher();
        teacher.setName("Håkan");
        teacher.setAge(60);
        teacher.setSubject("Programmering");
        student.introduce();
        student.getTeacherInfo(teacher);

    }
}

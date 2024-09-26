package se.johan_hammerin.lektion_9.associationer.Övning_1;

public class Student {
    private String name;
    private Course course;

    //Constructor
    public Student(String name, Course course) {
        setName(name);
        setCourse(course);
    }

    //Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

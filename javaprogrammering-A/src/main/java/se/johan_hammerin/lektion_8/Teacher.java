package se.johan_hammerin.lektion_8;

public class Teacher extends Person{

    private String subject;

    //methods
    @Override
    public void work() {
        System.out.println(getName() + " is working");
    }

    @Override
    public void introduce() {
        System.out.println(getName() + " " + getAge() + " " + getSubject());
    }


    //getter & setter
    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

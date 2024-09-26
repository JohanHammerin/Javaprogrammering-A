package se.johan_hammerin.Lektion_9.associationer.Övning_3;

public class Company {
    private Department[] departments;

    //Getter & Setter
    public Department[] departments() {
        return this.departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }
}

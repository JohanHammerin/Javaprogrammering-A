package se.johan_hammerin.w3Schools.n_Enums.Uppgift_5;

public enum DaysOfWeek implements Describable {
    MONDAY("First day of the week"),
    TUESDAY("Second day of the week"),
    WEDNESDAY("Third day of the week"),
    THURSDAY("Fourth day of the week"),
    FRIDAY("Fifth day of the week"),
    SATURDAY("Sixth day of the week"),
    SUNDAY("Seventh day of the week");

    //Attribut
    private String description;

    //Constructor
    DaysOfWeek(String description) {
        setDescription(description);
    }

    //Getter & Setter
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Method
    @Override
    public void printDescription() {
        System.out.println(getDescription());
    }
}

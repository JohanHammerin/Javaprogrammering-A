package se.johan_hammerin.lektion_9.associationer.Övning_2;

public class Publisher {
    private String name;
    private Magazine magazine;

    public Publisher(String name) {
        setName(name);
    }


    //Getters & Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Magazine getMagazine() {
        return this.magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
}


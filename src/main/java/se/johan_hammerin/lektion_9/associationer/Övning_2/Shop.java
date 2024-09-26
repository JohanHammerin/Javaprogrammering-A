package se.johan_hammerin.lektion_9.associationer.Övning_2;

public class Shop {
    Magazine[] magazines;

    //Constructor
    public Shop(Magazine[] magazines) {
        setMagazines(magazines);
    }

    //Getters & Setters
    public Magazine[] getMagazines() {
        return magazines;
    }

    public void setMagazines(Magazine[] magazines) {
        this.magazines = magazines;
    }
}

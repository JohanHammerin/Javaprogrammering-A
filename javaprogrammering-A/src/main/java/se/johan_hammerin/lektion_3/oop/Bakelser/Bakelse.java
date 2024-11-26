package se.johan_hammerin.lektion_3.oop.Bakelser;

public class Bakelse {
    private String name;
    private String form;
    private String smak;
    private String textur;
    private int pris;


    //Constructors
    public Bakelse() {

    }

    public Bakelse(String name, String form, String smak, String textur) {
        setName(name);
        setForm(form);
        setSmak(smak);
        setTextur(textur);
        setPris(pris);
    }


    //Methods

    public void äta() {
        System.out.println("Du åt precis en " + getName());
    }

    //Getters & Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return this.form;
    }

    public void setSmak(String smak) {
        this.smak = smak;
    }

    public String getSmak() {
        return this.smak;
    }

    public void setTextur(String textur) {
        this.textur = textur;
    }

    public String getTextur() {
        return this.textur;
    }

    public void setPris(int pris) {
        if (pris <= 0) {
            System.out.println("Bakelser är inte gratis!");
        } else {
            this.pris = pris;

        }
    }

    public int getPris() {
        return this.pris;
    }


    @Override
    public String toString() {
        return "Bakelse{" +
                "name='" + name + '\'' +
                ", form='" + form + '\'' +
                ", smak='" + smak + '\'' +
                ", textur='" + textur + '\'' +
                ", pris=" + pris +
                '}';
    }
}

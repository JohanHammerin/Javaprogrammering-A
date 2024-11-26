package se.johan_hammerin.lektion_3.oop.Bakelser;

public class Bullängd extends Bakelse {
    private int längd;
    private int bredd;
    private int höjd;
    private String fyllning;
    private boolean flätor;

    //Constructors
    public Bullängd() {
    }

    public Bullängd(String name, String form, String smak, String textur) {
        super(name, form, smak, textur);
    }

    //Methods
    private boolean checkIfZero(int num) {
        return num < 0;
    }


    @Override
    public void äta() {
        super.äta();
    }

    //Setters & getters
    public void setLängd(int längd) {
        if (checkIfZero(längd)) {
            längd = 0;
        } else {
            this.längd = längd;

        }
    }

    public int getLängd() {
        return this.längd;
    }

    public void setBredd(int bredd) {
        if (checkIfZero(bredd)) {
            bredd = 0;
        } else {
            this.bredd = bredd;
        }
    }

    public int getBredd() {
        return this.bredd;
    }

    public void setHöjd(int höjd) {
        if (checkIfZero(höjd)) {
            höjd = 0;
        } else {
            this.höjd = höjd;
        }
    }

    public void setFyllning(String fyllning) {
        this.fyllning = fyllning;
    }

    public String getFyllning() {
        return this.fyllning;
    }

    public void setFlätor(boolean flätor) {
        this.flätor = flätor;
    }

    public boolean isFlätor() {
        return this.flätor;
    }


    @Override
    public String toString() {
        return super.toString() +  "\nBullängd{" +
                "längd=" + längd +
                ", bredd=" + bredd +
                ", höjd=" + höjd +
                ", fyllning='" + fyllning + '\'' +
                ", flätor=" + flätor +
                '}';
    }
}

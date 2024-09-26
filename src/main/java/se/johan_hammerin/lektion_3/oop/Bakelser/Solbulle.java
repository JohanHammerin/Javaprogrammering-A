package se.johan_hammerin.lektion_3.oop.Bakelser;

public class Solbulle extends Bakelse {
    private int vaniljKräm;
    private boolean socker;
    private int sockerPåTopp;


    //Constructors

    public Solbulle() {
    }

    public Solbulle(String name, String form, String smak, String textur) {
        super(name, form, smak, textur);
    }

    //Methods
    @Override
    public void äta() {
        super.äta();
    }


    //Getters & Setters
    public void setVaniljKräm(int vaniljKräm) {
        if (vaniljKräm < 0) {
            System.out.println("En solbulle måsta ha vaniljkräm!");
        } else {
            this.vaniljKräm = vaniljKräm;
        }
    }

    public int getVaniljKräm() {
        return this.vaniljKräm;
    }

    public void setSocker(boolean socker) {
        this.socker = socker;
    }

    public boolean isSocker() {
        return this.socker;
    }

    public void setSockerPåTopp(int sockerPåTopp) {
        this.sockerPåTopp = sockerPåTopp;
    }

    public int getSockerPåTopp() {
        return this.sockerPåTopp;
    }



    @Override
    public String toString() {
        return super.toString() +  "\nSolbulle{" +
                "vaniljKräm=" + vaniljKräm +
                ", socker=" + socker +
                ", sockerPåTopp=" + sockerPåTopp +
                '}';
    }
}

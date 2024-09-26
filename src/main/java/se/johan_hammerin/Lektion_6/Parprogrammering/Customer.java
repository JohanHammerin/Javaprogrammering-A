package se.johan_hammerin.Lektion_6.Parprogrammering;

public class Customer {
    private String name;
    private String mail;


    //Constructor
    Customer(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getMail() {
        return this.mail;
    }
}

package se.johan_hammerin.lektion_9.toString;

public class Apartment {
    private String adress;
    private int floor;
    private double rent;

    public Apartment(String adress, int floor, double rent) {
        setAdress(adress);
        setFloor(floor);
        setRent(rent);
    }

    //Getters & Setters
    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getRent() {
        return this.rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    //toString
    @Override
    public String toString() {
        return "adress:" + getAdress() + "\n" +
                "floor:" + getFloor() + "\n" +
                "rent:" + getRent() + "kr";
    }
}

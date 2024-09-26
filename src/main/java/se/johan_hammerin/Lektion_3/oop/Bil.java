package se.johan_hammerin.Lektion_3.oop;

public class Bil {
    private String model;
    private int price;
    private String colour;
    private int buildYear;
    private int speed;

    //Constructors
    public Bil(String model, int price, String colour, int buildYear) {
        setModel(model);
        setPrice(price);
        setColour(colour);
        setBuildYear(buildYear);
        setSpeed(0);
    }

    //Methods

    public void start() {
        System.out.println("Car has started");
    }

    public void stop() {

        if (hasStopped()) {
            System.out.println("Bilen står redan stilla");
        } else {
            setSpeed(0);
            System.out.println("Bilen har stannat");
        }
    }

    public void accelerate(int num) {
        if (num <= 0) {
            System.out.println("En bil kan inte accelerera baklänges!");
        } else {
            setSpeed(getSpeed() + num);
        }
    }

    private boolean hasStopped() {
        return getSpeed() == 0;
    }


    //Getters & Setters
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getBuildYear() {
        return this.buildYear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}

package se.johan_hammerin.w3Schools.n_Enums.Uppgift_4;

public enum Colour {


    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);


    //Attributes
    private int red, green, blue;


    //Constructor
    Colour(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    //Method
    public void printRGB() {
        System.out.println(getClass().getSimpleName() + ": (" + getRed() + ", " + getGreen() + ", " + getBlue() + ")");
    }


    //Getters & Setters
    public int getRed() {
        return this.red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return this.green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return this.blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }


}

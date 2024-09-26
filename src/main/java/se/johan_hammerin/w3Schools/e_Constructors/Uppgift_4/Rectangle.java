package se.johan_hammerin.w3Schools.e_Constructors.Uppgift_4;

public class Rectangle {
    private int width;
    private int height;

    //Constructor
    Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    //getters & setters
    public int getWidth() {
        return this.width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}

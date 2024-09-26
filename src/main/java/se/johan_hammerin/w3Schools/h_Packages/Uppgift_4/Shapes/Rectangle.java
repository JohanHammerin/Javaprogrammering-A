package se.johan_hammerin.w3Schools.h_Packages.Uppgift_4.Shapes;

public class Rectangle {
    private double length;
    private double width;

    //Constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    //Methods
    public double getArea() {
        return getLength() * getWidth();
    }

    public double getCircumference() {
        return (getLength() * 2) + (getWidth() * 2);
    }


    //Getters & Setters
    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        if (length < 0) {
            System.out.println("Längden kan inte vara negativ");
        } else {
            this.length = length;

        }
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        if(width < 0) {
            System.out.println("Bredden kan inte vara negativ");
        } else {
            this.width = width;
        }
    }
}

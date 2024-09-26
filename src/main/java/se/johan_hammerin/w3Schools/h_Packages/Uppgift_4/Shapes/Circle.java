package se.johan_hammerin.w3Schools.h_Packages.Uppgift_4.Shapes;

public class Circle {
    private double radius;

    //Constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    //methods
    public double getArea() {
        // double area = Math.PI * (radius * radius);
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getCircumference() {
        //double circumference= Math.PI * 2*radius;
        return Math.PI * (2 * getRadius());
    }

    //getter & setter
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Radien på en cirkel kan inte vara 0");
        } else {
            this.radius = radius;
        }
    }
}
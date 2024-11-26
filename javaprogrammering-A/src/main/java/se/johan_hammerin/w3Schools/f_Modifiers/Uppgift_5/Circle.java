package se.johan_hammerin.w3Schools.f_Modifiers.Uppgift_5;

public class Circle extends Shape {
    final double PI = Math.PI;

    Circle(String colour) {
        super(colour);
    }

    @Override
    public String toString() {
        return "colour:" + this.colour + "\nPI = " + this.PI;
    }
}

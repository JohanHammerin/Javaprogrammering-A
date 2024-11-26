package se.johan_hammerin.w3Schools.i_Inheritance.Uppgift_7;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        drawShape(circle);
        drawShape(rectangle);
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }
}

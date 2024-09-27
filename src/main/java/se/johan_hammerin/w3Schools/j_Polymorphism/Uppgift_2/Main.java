package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        drawShape(circle);
        drawShape(rectangle);
        drawShape(triangle);
    }

    public static void drawShape(Shape shape) {
        shape.draw();
    }
}

package se.johan_hammerin.w3Schools.h_Packages.Uppgift_4.Geometry;
import se.johan_hammerin.w3Schools.h_Packages.Uppgift_4.Shapes.*;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(-2,2);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

        System.out.println(circle.getCircumference());
        System.out.println(rectangle.getCircumference());
    }
}

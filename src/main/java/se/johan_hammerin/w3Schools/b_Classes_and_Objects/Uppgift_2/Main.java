package se.johan_hammerin.w3Schools.b_Classes_and_Objects.Uppgift_2;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car("Red");
        Car secondCar = new Car("Blue");
        System.out.println(firstCar.getColour() + " " + secondCar.getColour());
    }
}

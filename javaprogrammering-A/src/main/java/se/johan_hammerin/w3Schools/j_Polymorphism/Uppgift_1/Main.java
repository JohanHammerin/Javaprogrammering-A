package se.johan_hammerin.w3Schools.j_Polymorphism.Uppgift_1;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.startEngine();
        bike.startEngine();
    }
}

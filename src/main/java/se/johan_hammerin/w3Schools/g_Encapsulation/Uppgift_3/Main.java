package se.johan_hammerin.w3Schools.g_Encapsulation.Uppgift_3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setMileage(200);
        car1.drive(21);
        System.out.println(car1);

    }
}

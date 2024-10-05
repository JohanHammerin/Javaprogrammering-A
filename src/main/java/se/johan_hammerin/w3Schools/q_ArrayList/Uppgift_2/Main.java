package se.johan_hammerin.w3Schools.q_ArrayList.Uppgift_2;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Porsche");

        cars.set(0,"Tesla");
        System.out.println(cars);
    }
}

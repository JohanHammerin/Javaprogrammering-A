package se.johan_hammerin.w3Schools.q_ArrayList.Uppgift_3;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Porsche");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Audi");

        cars.removeFirst();
        System.out.println("Längden på ArrayList efter borttagning:" + cars.size());
    }
}

package se.johan_hammerin.w3Schools.q_ArrayList.Uppgift_4;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Ford");
        cars.add("Opel");

        //Vanlig for-loop
        for(int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("-".repeat(100));
        //for-each
        for(String s: cars) {
            System.out.println(s);
        }
    }
}

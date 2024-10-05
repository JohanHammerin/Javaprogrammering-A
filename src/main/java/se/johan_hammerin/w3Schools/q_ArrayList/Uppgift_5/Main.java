package se.johan_hammerin.w3Schools.q_ArrayList.Uppgift_5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("Porsche");
        cars.add("BMW");
        cars.add("Audi");
        System.out.println("Innan listan sorterats:" + cars);
        Collections.sort(cars);
        System.out.println("Efter listan sorterats:" + cars);
    }
}

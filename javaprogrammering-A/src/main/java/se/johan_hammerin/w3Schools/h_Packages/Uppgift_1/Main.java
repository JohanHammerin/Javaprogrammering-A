package se.johan_hammerin.w3Schools.h_Packages.Uppgift_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String name;
            int age;

            System.out.print("namn:");
            name = input.nextLine();
            while (true) {
                try {
                    System.out.print("ålder:");
                    age = input.nextInt();
                    if(age < 0) {
                        System.out.println("Din ålder kan inte vara negativ");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Måste ange ett nummer");
                    input.nextLine();
                }

            }
            System.out.println("namn:" + name + "\n" +
                    "ålder:" + age);
        }
    }
}

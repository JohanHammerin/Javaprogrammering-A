package se.johan_hammerin.w3Schools.h_Packages.Uppgift_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("ange din gissning");
                int userGuess = input.nextInt();

                if(userGuess < randomNum) {
                    System.out.println("för lågt");
                } else if (userGuess > randomNum) {
                    System.out.println("för högt");
                } else {
                    System.out.println("Rätt");
                    break;
                }
            }
        }
    }
}

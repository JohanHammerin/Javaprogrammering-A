package se.johan_hammerin.Lektion_10.Övning_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String answer;
            do {
                System.out.println("Vill du fortsätta? (ja/nej):");
                answer = input.nextLine();
            } while (answer.equals("ja"));
            {
                System.out.println("Nu avslutas programmet...");
            }
        }
    }
}

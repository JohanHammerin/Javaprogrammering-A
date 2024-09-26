package se.johan_hammerin.Lektion_4.SwitchExercise;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] time = {"13:00", "14:00", "15:00", "16:00", "17:00", "18:00"};

            System.out.print("Ange ett nummer mellan 1 och 6:\n");
            int choice = input.nextInt(); // Försöker läsa ett heltal

            switch (choice - 1) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println(time[choice - 1]);
                    break;
                default:
                    System.out.println("Ogiltig timme");
            }
        }
    }
}
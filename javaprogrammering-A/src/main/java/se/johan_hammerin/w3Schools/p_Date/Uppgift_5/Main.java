package se.johan_hammerin.w3Schools.p_Date.Uppgift_5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String option = "";
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Choose date format:\n" +
                "1. yyyy-MM-dd\n" +
                "2. dd/MM/yyyy\n" +
                "3. dd-MMM-yyyy\n" +
                "4. E, MMM dd yyyy");

        try (Scanner input = new Scanner(System.in)) {
            option = switch (input.nextInt()) {
                case 1 -> "yyyy-MM-dd";
                case 2 -> "dd/MM/yyyy";
                case 3 -> "dd-MMM-yyyy";
                case 4 -> "E, MMM dd yyyy";
                default -> option;
            };
            DateTimeFormatter formattedCurrentDateTime = DateTimeFormatter.ofPattern(option);
            String formattedCurrentDateTimeString = formattedCurrentDateTime.format(currentDateTime);
            System.out.println(formattedCurrentDateTimeString);
        }
    }

}

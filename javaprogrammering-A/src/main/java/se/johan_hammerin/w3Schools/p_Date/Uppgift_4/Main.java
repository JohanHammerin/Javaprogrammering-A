package se.johan_hammerin.w3Schools.p_Date.Uppgift_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("before formatting: " + currentDateAndTime);

        DateTimeFormatter formattedDateAndTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateAndTimeString = currentDateAndTime.format(formattedDateAndTime);
        System.out.println("after formatting: " + formattedDateAndTimeString);
    }
}

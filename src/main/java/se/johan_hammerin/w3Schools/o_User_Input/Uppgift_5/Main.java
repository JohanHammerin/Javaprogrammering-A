package se.johan_hammerin.w3Schools.o_User_Input.Uppgift_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Första decimal talet:");
            double firstDecimal = input.nextDouble();
            System.out.print("Andra decimal talet:");
            double secondDecimal = input.nextDouble();

            System.out.print("sum:" + (firstDecimal + secondDecimal));

        }
    }
}

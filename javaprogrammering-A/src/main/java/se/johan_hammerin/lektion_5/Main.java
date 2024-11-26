package se.johan_hammerin.lektion_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Välj en operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            int choice = input.nextInt();
            System.out.println("Ange ditt första heltal");
            int firstNum = input.nextInt();
            System.out.println("Ange ditt andra heltal");
            int secondNum = input.nextInt();
            Calculator calculator = new Calculator();
            switch (choice) {
                case 1:
                    System.out.println("sum = " + calculator.add(firstNum, secondNum));
                    break;

                case 2:
                    System.out.println("sum = " + calculator.subtract(firstNum, secondNum));
                    break;

                case 3:
                    System.out.println("sum = " + calculator.multiply(firstNum, secondNum));
                    break;

                case 4:
                    System.out.println("sum = " + calculator.divide(firstNum, secondNum));
                    break;
            }
        }
    }
}

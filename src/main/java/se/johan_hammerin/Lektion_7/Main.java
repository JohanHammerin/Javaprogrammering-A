package se.johan_hammerin.Lektion_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;
        char action;
        System.out.println("Ange din beräkning!");
        System.out.println("Format [a+b]");
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                String calculation = input.nextLine().trim();
                firstNum = Integer.parseInt(String.valueOf(calculation.charAt(0)));
                action = calculation.charAt(1);
                if (action != '+' && action != '-' && action != '*' && action != '/') {
                    throw new IllegalArgumentException();
                }
                secondNum = Integer.parseInt(String.valueOf(calculation.charAt(2)));
                break;
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Måste följa formatet");
                System.out.println("Format [a+b]");
            }
        }
        Calculator calculator = new Calculator();
        calculator.calculate(firstNum, secondNum, action);

    }


}

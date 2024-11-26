package se.johan_hammerin.lektion_4.Calculator;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greeting();

        // Ställ in locale för att hantera kommatecken som decimalavgränsare (t.ex. Tyskland)
        Locale locale = Locale.GERMANY;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);

        // Använd try-with-resources för att automatiskt stänga scannern
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.print("Ange en beräkning: ");
                String inputLine = input.nextLine().trim();

                // Kontrollera om användaren vill avsluta programmet
                if (Objects.equals(inputLine, "?")) {
                    System.out.println("Avslutar programmet...");
                    break;
                }

                // Försök att bearbeta input
                try {
                    // Dela upp inputen vid operatorer (+, -, *, /)
                    String[] equation = parseEquation(inputLine);

                    // Skapa calculator-objekt och sätt värden
                    Calculator calculator = new Calculator();
                    calculator.setFirstDouble(parseNumber(equation[0], numberFormat));
                    calculator.setSecondDouble(parseNumber(equation[2], numberFormat));

                    // Utför operationen baserat på operatorn
                    processOperation(equation[1], calculator);

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (ParseException e) {
                    System.out.println("Felaktigt format. Kontrollera att du endast använder giltiga tal.");
                }
            }
        }
    }

    // Hälsningsmetod
    public static void greeting() {
        System.out.println("Välkommen till !MINIRÄKNAREN!");
        System.out.println("FORMAT: a+b, a-b, a*b, a/b");
        System.out.println("Avsluta programmet med [?]");
    }

    // Metod för att dela upp ekvationen i tal och operator
    public static String[] parseEquation(String inputLine) {
        String[] equation = inputLine.split("(?<=[-+*/])|(?=[-+*/])");

        if (equation.length != 3) {
            throw new IllegalArgumentException("Felaktigt format. Använd formatet a+b, a-b, a*b, a/b");
        }

        return equation;
    }

    // Metod för att parsa nummer baserat på givet NumberFormat
    public static double parseNumber(String input, NumberFormat numberFormat) throws ParseException {
        return numberFormat.parse(input.trim()).doubleValue();
    }

    // Metod för att behandla olika operationer
    public static void processOperation(String operator, Calculator calculator) {
        double result;
        switch (operator) {
            case "+":
                result = calculator.add(calculator.getFirstDouble(), calculator.getSecondDouble());
                printResult(result, calculator);
                break;
            case "-":
                result = calculator.subtract(calculator.getFirstDouble(), calculator.getSecondDouble());
                printResult(result, calculator);
                break;
            case "*":
                result = calculator.multiply(calculator.getFirstDouble(), calculator.getSecondDouble());
                printResult(result, calculator);
                break;
            case "/":
                if (calculator.getSecondDouble() == 0) {
                    System.out.println("Division med noll är inte tillåten.");
                } else {
                    result = calculator.divide(calculator.getFirstDouble(), calculator.getSecondDouble());
                    printResult(result, calculator);
                }
                break;
            default:
                throw new IllegalArgumentException("Ogiltig operator. Använd [+,-,*,/]");
        }
    }

    // Ny metod för att skriva ut resultatet korrekt
    public static void printResult(double result, Calculator calculator) {
        if (isWholeNumber(calculator.getFirstDouble()) && isWholeNumber(calculator.getSecondDouble()) && isWholeNumber(result)) {
            // Om både inmatade tal och resultatet är heltal, skriv ut som int
            System.out.println("Resultat: " + (int) result);
        } else {
            // Annars, skriv ut som double
            System.out.println("Resultat: " + result);
        }
    }

    // Metod för att kontrollera om ett tal är ett heltal
    public static boolean isWholeNumber(double number) {
        return number % 1 == 0;
    }
}


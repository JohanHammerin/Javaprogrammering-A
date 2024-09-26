package se.johan_hammerin.Lektion_7;

public class Calculator {

    public void calculate(int num1, int num2, char action) {
        switch (action) {
            case '+':
                System.out.println(add(num1, num2));
                break;
            case '-':
                System.out.println(subtract(num1, num2));
                break;
            case '*':
                System.out.println(multiply(num1, num2));
                break;
            case '/':
                System.out.println(divide(num1, num2));
                break;
            default:
                System.out.println("Måste ange ett giltigt räknesätt");
                break;

        }

    }

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }
}

package se.johan_hammerin.lektion_11.calculator;

public class Calculator {

    //Methods
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }

    public double squareRootOf(double num1) {
        return Math.sqrt(num1);
    }

    public double getCircumferenceOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public double getAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

}

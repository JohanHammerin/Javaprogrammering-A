package se.johan_hammerin.lektion_4.Calculator;

public class Calculator {
    private double firstDouble;
    private double secondDouble;


    //Constructors
    public Calculator() {

    }

    //Methods
    public double add(double firstDouble, double secondDouble) {
        return firstDouble + secondDouble;
    }

    public double subtract(double firstDouble, double secondDouble) {
        return firstDouble - secondDouble;
    }

    public double multiply(double firstDouble, double secondDouble) {
        return firstDouble * secondDouble;
    }

    public double divide(double firstDouble, double secondDouble) {
        return firstDouble / secondDouble;
    }


    //Getters & Setters
    public double getFirstDouble() {
        return this.firstDouble;
    }

    public void setFirstDouble(double firstDouble) {
        this.firstDouble = firstDouble;
    }

    public double getSecondDouble() {
        return this.secondDouble;
    }

    public void setSecondDouble(double secondDouble) {
        this.secondDouble = secondDouble;
    }
}

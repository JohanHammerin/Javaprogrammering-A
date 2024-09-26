package se.johan_hammerin.CalculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.johan_hammerin.lektion_11.calculator.Calculator;


public class CalculatorTest {

    public Calculator createCalculator() {
        return new Calculator();
    }

    @Test
    public void testAdd() {
        Calculator calculator = createCalculator();
        Assertions.assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = createCalculator();
        Assertions.assertEquals(10, calculator.subtract(12, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = createCalculator();
        Assertions.assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = createCalculator();

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10,0);
        }, "Division med 0 ska kasta ArithmeticException");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = createCalculator();
        Assertions.assertEquals(100,calculator.multiply(10,10));
    }

    @Test
    public void testSquareRootOf() {
        Calculator calculator = createCalculator();

        Assertions.assertEquals(4,calculator.squareRootOf(16));
    }

}

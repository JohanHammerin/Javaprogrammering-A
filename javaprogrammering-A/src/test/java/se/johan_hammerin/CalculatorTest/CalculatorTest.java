package se.johan_hammerin.CalculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.johan_hammerin.lektion_11.calculator.Calculator;


public class CalculatorTest {
    Calculator calculator = new Calculator();


    @Test
    public void testAdd() {
        Assertions.assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(10, calculator.subtract(12, 2));
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(5, calculator.divide(10, 2));
    }

    @Test
    public void testDivisionByZero() {

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        }, "Division med 0 ska kasta ArithmeticException");
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(100, calculator.multiply(10, 10));
    }

    @Test
    public void testSquareRootOf() {
        Assertions.assertEquals(4, calculator.squareRootOf(16));
    }

}

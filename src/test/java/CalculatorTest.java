import calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    public Calculator calculator = new Calculator("Casio");

    @Test
    public void addTest() {
        assertEquals("Sum of two numbers is not correct", 30.0, calculator.add(20, 10), 0);
    }

    @Test
    public void subtractTest() {
        assertEquals("Subtract of two numbers is not correct", 12.6, calculator.subtract(20, 7.4), 0);
    }

    @Test
    public void multiplyTest() {
        assertEquals("Multiplication of two numbers is not correct", 13.02, calculator.multiply(4.2, 3.1), 0);
    }

    @Test
    public void divisionTest() {
        assertEquals("Division of two numbers is not correct", 4.73, calculator.divide(10.4, 2.2), 0);
    }

    @Test
    public void calcNameTest() {
        Calculator calc = new Calculator("Citizen");
        assertEquals("Citizen", calc.getCalculatorName());
    }
}

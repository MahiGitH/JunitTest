import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationMultiplyTest {

    @Test
    void multiply() {
        CalculationMultiply multiply = new CalculationMultiply();
        int expected = 25;
        int actual = multiply.multiply(5,5);
        assertEquals(expected,actual);
    }

    @Test
    void multiplyFailTest() {
        CalculationMultiply multiply = new CalculationMultiply();
        int expected = 10;
        int actual = multiply.multiply(5,5);
        assertEquals(expected,actual);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationSubTest {

    @Test
    void subtraction() {
            CalculationSub sub = new CalculationSub();
            int expected = 5;
            int actual = sub.subtraction(10,5);
            assertEquals(expected,actual);
    }
    @Test
    void subtractionFailTest() {
        CalculationSub sub = new CalculationSub();
        int expected = 3;
        int actual = sub.subtraction(10,5);
        assertEquals(expected,actual);

    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationAddTest {

    @Test
    void addition() {
        CalculationAdd add = new CalculationAdd();
        int expected = 10;
        int actual = add.addition(5,5);
        assertEquals(expected,actual);
    }

    @Test
    void additionFailTest() {
        CalculationAdd add = new CalculationAdd();
        int expected = 12;
        int actual = add.addition(5,5);
        assertEquals(expected,actual);
    }

}
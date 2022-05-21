import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveNumbersTest {

    @Test
    void enterPositiveNum() {
        PositiveNumbers positiveNum = new PositiveNumbers();
        String expected = "Number is " + 4;
        String actual = positiveNum.enterPositiveNum(4);
        assertEquals(expected,actual);
    }

    @Test
    void NegativeNumTest() {
        PositiveNumbers negativeNum = new PositiveNumbers();
        String expected = "Numbers must be a positive number or greater than zero";
        String actual = negativeNum.enterPositiveNum(-4);
        assertEquals(expected,actual);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationDivisionTest {

    @Test
    void division() {
        CalculationDivision division = new CalculationDivision();
        int expected = 4;
        int actual = division.division(20,5);
        assertEquals(expected,actual);
    }

@Test
    void divisionFailTest() {
        CalculationDivision division = new CalculationDivision();
        int expected = 2;
        int actual = division.division(20,5);
        assertEquals(expected,actual);
    }
}
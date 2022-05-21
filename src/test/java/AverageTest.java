import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {

    @Test
    void numAverage() {
        Average average = new Average();

        double expected = 2;
        double actual = average.numAverage(2,2,2);
        assertEquals(expected, actual);
    }

    @Test
    void numAverageFailTest() {
        Average average = new Average();

        double expected = 6;
        double actual = average.numAverage(2,2,2);
        assertEquals(expected, actual);
    }
}
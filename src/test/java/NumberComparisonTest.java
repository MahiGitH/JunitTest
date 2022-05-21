import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberComparisonTest {

    @Test
    void TwoNumsAreEqual() {
        NumberComparison compareNums = new NumberComparison();
        String expected = "Numbers are the same";
        String actual = compareNums.compareTwoNums(2, 2);
        assertEquals(expected, actual);
    }

@Test
    void FirstNumsIsGreaterThanSecond() {
        NumberComparison compareNums = new NumberComparison();
        String expected = "The first number was larger than the second";
        String actual = compareNums.compareTwoNums(3, 2);
        assertEquals(expected, actual);
    }

@Test
    void SecondNumsIsGreaterThanFirst() {
        NumberComparison compareNums = new NumberComparison();
        String expected = "The second number was larger than the first";
        String actual = compareNums.compareTwoNums(2, 3);
        assertEquals(expected, actual);
    }

@Test
    void SecondNumsIsGreaterThanFirstFailTest() {
        NumberComparison compareNums = new NumberComparison();
        String expected = "The second number was larger than the first";
        String actual = compareNums.compareTwoNums(2, 1);
        assertEquals(expected, actual);
    }
}
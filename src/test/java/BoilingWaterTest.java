import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoilingWaterTest {

    @Test
    void waterBoilGreaterThanTwoHundredTwelve() {
        BoilingWater boilingWater = new BoilingWater();

        String expected = "Water is boiling!";
        String actual = boilingWater.checkWaterTemp(250);
        assertEquals(expected, actual);
    }

    @Test
    void waterBoilLessThanTwoHundredTwelveFailTest() {
        BoilingWater boilingWater = new BoilingWater();

        String expected = "Water is boiling!";
        String actual = boilingWater.checkWaterTemp(195);
        assertEquals(expected, actual);
    }

    @Test
    void waterBoilEqualToTwoHundredTwelveFailTest() {
        BoilingWater boilingWater = new BoilingWater();

        String expected = "Water is boiling!";
        String actual = boilingWater.checkWaterTemp(212);
        assertEquals(expected, actual);
    }
}
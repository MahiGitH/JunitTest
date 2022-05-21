import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodReturnTypesTest {

    @Test
    void stringReturn() {
        MethodReturnTypes methodReturnTypes = new MethodReturnTypes();
        String expected = "Only String Allowed";
        String actual = methodReturnTypes.stringReturn();
        assertEquals(expected, actual);
    }

    @Test
    void integerReturn() {
        MethodReturnTypes methodReturnTypes = new MethodReturnTypes();
        int expected = 5;
        int actual = methodReturnTypes.integerReturn();
        assertEquals(expected, actual);
    }

    @Test
    void booleanReturn() {
        MethodReturnTypes methodReturnTypes = new MethodReturnTypes();
        boolean expected = false;
        boolean actual = methodReturnTypes.booleanReturn();
        assertEquals(expected, actual);
    }
}
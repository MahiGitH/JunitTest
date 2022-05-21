import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatBotAgeGuessTest {

    @Test
    void guessAge() {
        ChatBotAgeGuess ageGuess = new ChatBotAgeGuess();
        int expected = 58;
        int actual = ageGuess.guessAge(7, 8, 9);
        assertEquals(expected, actual);
    }
}
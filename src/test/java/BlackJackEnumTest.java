import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Pass enum values to our test method")
class BlackJackEnumTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before each test method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test method");
    }

    @DisplayName("Should pass non-null enum values as method parameters")
    @ParameterizedTest(name = "{index} => blackJackSuit=''{0}''")
    @EnumSource(BlackJackEnum.class)
    void shouldPassNonNullEnumValuesAsMethodParameter(BlackJackEnum blackJackEnum) {
        assertNotNull(blackJackEnum);
    }

    @DisplayName("Should pass non-null enum values as method parameters")
    @ParameterizedTest(name = "{index} => blackJackSuit=''{0}''")
    @EnumSource(value = BlackJackEnum.class, names = {"DIAMOND"})
    void testOneValueOfSUIT(BlackJackEnum blackJackEnum) {
        assertNotNull(blackJackEnum);
    }
}
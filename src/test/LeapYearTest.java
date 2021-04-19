import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearTest {
    @ParameterizedTest
    @ValueSource(ints = {2020, 2400})
    void leapYear(int value) {
        Year year = new Year(value);

        boolean result = year.isLeap();

        assertThat(result).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {2100, 1977})
    void notLeapYear(int value) {
        Year year = new Year(value);

        boolean result = year.isLeap();

        assertThat(result).isFalse();
    }

}

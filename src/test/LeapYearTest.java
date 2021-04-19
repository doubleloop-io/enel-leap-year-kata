import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearTest {
    @ParameterizedTest
    @ValueSource(ints = {2020, 2400})
    void leapYear(int year) {
        assertThat(isLeapYear(year)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {2100, 1977})
    void notLeapYear(int year) {
        assertThat(isLeapYear(year)).isFalse();
    }

    private static boolean isLeapYear(int year) {
        Year year1 = new Year(year);
        if (isDivisibleBy(year1.year, 400)) return true;
        if (isDivisibleBy(year1.year, 100)) return false;
        if (isDivisibleBy(year1.year, 4)) return true;
        return false;
    }

    private static boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }
}

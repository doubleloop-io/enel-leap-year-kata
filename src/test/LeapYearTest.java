import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearTest {
    @Test
    void leapYear() {
        assertThat(isLeapYear(2400)).isTrue();
        assertThat(isLeapYear(2020)).isTrue();
    }

    @Test
    void notLeapYear() {
        assertThat(isLeapYear(2100)).isFalse();
    }

    private boolean isLeapYear(int year) {
        if (isDivisibleBy(year, 400)) return true;
        if (isDivisibleBy(year, 100)) return false;
        if (isDivisibleBy(year, 4)) return true;
        return false;
    }

    private boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }
}

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearTest {
    @Test
    void leapYear() {
        assertThat(isLeapYear(2020)).isTrue();
    }

    @Test
    void notLeapYear() {
        assertThat(isLeapYear(2100)).isFalse();
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) return true;
        return false;
    }
}

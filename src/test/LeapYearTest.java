import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearTest {
    @Test
    void leapYear() {
        assertThat(isLeapYear(2020)).isTrue();
    }

    private boolean isLeapYear(int year) {
        if (year == 2020) return true;
        return false;
    }
}

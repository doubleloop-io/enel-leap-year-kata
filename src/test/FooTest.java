import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooTest {
    @Test
    void succeed() {
        assertThat(true).isTrue();
    }

    @Test
    void failing() {
        assertThat(false).isTrue();
    }
}

package moe.yufan.study.chapter1.section1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author せいうはん (Wesleysheng)
 */
@SuppressWarnings({"squid:S1192", "squid:S00100"})
class LargeLogTest {

    @Test
    void lg_result_assert() {
        int result = LargeLog.lg(2);
        assertThat(result).isEqualTo(1);

        result = LargeLog.lg(3);
        assertThat(result).isEqualTo(1);

        result = LargeLog.lg(4);
        assertThat(result).isEqualTo(2);

        result = LargeLog.lg(10);
        assertThat(result).isEqualTo(3);
    }
}

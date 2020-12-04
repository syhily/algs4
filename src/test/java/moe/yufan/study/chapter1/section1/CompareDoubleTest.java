package moe.yufan.study.chapter1.section1;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author せいうはん (Wesleysheng)
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@SuppressWarnings({"squid:S1192", "squid:S00100"})
class CompareDoubleTest {

    @Test
    void both_double_Would_match_the_requirements() {
        boolean result = CompareDouble.compare(0.1, 0.5);
        assertThat(result).isTrue();
    }

    @Test
    void false_would_be_return_for_bigger_doubles() {
        boolean result = CompareDouble.compare(0.1, 1.5);
        assertThat(result).isFalse();
    }
}

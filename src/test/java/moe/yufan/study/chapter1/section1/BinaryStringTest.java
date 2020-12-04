package moe.yufan.study.chapter1.section1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author せいうはん (Wesleysheng)
 */
@SuppressWarnings({"squid:S1192", "squid:S00100"})
class BinaryStringTest {

    @Test
    void integer_to_binary_string() {
        assertBinary(9, "1001");
        assertBinary(10, "1010");
        assertBinary(11, "1011");
    }

    private void assertBinary(int i, String expectFormat) {
        String format = BinaryString.binaryFormat(i);
        assertThat(format)
            .describedAs("Expect " + i + " in binary format " + expectFormat)
            .isEqualTo(expectFormat);
    }
}

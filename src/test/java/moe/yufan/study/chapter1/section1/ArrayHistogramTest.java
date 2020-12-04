package moe.yufan.study.chapter1.section1;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author せいうはん (Wesleysheng)
 */
@SuppressWarnings({"squid:S1192", "squid:S00100"})
class ArrayHistogramTest {

    private final Random random = new Random(System.currentTimeMillis());

    @RepeatedTest(30)
    void random_array_histogram() {
        int[] array = generateArray(20, 10);
        int[] histogram = ArrayHistogram.histogram(array, 11);
        assertThat(sumArrayValue(histogram)).isEqualTo(20);

        array = generateArray(40, 13);
        histogram = ArrayHistogram.histogram(array, 14);
        assertThat(sumArrayValue(histogram)).isEqualTo(40);
    }

    private int sumArrayValue(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }

        return result;
    }

    private int[] generateArray(int length, int maxNumber) {
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(maxNumber);
        }

        return result;
    }
}

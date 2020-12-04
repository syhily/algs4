package moe.yufan.study.chapter1.section1;

import lombok.experimental.UtilityClass;

/**
 * Write a static method histogram() that takes an array a[] of int values
 * and an integer M as arguments and returns an array of length M
 * whose ith entry is the number of times the integer i appeared in the argument array.
 * <p>
 * If the values in a[] are all between 0 and M–1,
 * the sum of the values in the returned array should be equal to a.length.
 *
 * @author せいうはん (Wesleysheng)
 * @version 1.0.0, 2020-12-04 22:35
 * @since 1.0.0, 2020-12-04 22:35
 */
@UtilityClass
public class ArrayHistogram {

    public static int[] histogram(int[] array, int m) {
        int[] result = new int[m];
        for (int i : array) {
            if (i < m && i >= 0) {
                result[i] += 1;
            }
        }

        return result;
    }
}

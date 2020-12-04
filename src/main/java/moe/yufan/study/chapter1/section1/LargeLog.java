package moe.yufan.study.chapter1.section1;

/**
 * Write a static method lg() that takes an int value N as argument
 * and returns the largest int not larger than the base-2 logarithm of N. Do not use Math.
 *
 * @author せいうはん (Wesleysheng)
 * @version 1.0.0, 2020-12-04 22:10
 * @since 1.0.0, 2020-12-04 22:10
 */
public class LargeLog {

    public static int lg(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Num " + num + " should be positive.");
        }

        int result = -1;
        for (int compare = 1; compare <= num; compare *= 2) {
            result += 1;
        }

        return result;
    }
}

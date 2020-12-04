package moe.yufan.study.chapter1.section1;

import lombok.experimental.UtilityClass;

/**
 * Write a code fragment that puts the binary representation of a positive integer N into a String s.
 *
 * @author せいうはん (Wesleysheng)
 * @version 1.0.0, 2020-12-04 21:31
 * @since 1.0.0, 2020-12-04 21:31
 */
@UtilityClass
public class BinaryString {

    public static String binaryFormat(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input number " + num + " should be positive.");
        }

        StringBuilder builder = new StringBuilder();
        do {
            builder.append(num % 2);
            num = num / 2;
        } while (num > 0);

        return builder.reverse().toString();
    }
}

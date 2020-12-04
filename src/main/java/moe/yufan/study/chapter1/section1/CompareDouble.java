package moe.yufan.study.chapter1.section1;

import lombok.experimental.UtilityClass;

/**
 * Write a code fragment that prints true if the double variables x and y are both strictly
 * between 0 and 1 and false otherwise.
 *
 * @author せいうはん (Wesleysheng)
 * @version 1.0.0, 2020-12-04 21:10
 * @since 1.0.0, 2020-12-04 21:10
 */
@UtilityClass
public class CompareDouble {

    public static boolean compare(double x, double y) {
        return betweenZeroToOne(x) && betweenZeroToOne(y);
    }

    private static boolean betweenZeroToOne(double num) {
        return num > 0.0 && num < 1.0;
    }
}

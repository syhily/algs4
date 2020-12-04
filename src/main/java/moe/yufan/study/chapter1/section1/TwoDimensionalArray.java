package moe.yufan.study.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Write a code fragment that prints the contents of a two-dimensional boolean array,
 * using * to represent true and a space to represent false. Include row and column numbers.
 *
 * @author せいうはん (Wesleysheng)
 * @version 1.0.0, 2020-12-04 21:53
 * @since 1.0.0, 2020-12-04 21:53
 */
public class TwoDimensionalArray {

    public void printArray(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean[] booleans = array[i];
            for (int i1 = 0; i1 < booleans.length; i1++) {
                boolean res = booleans[i1];
                StdOut.printf("array[%d][%d] = \"%s\"", i, i1, res ? "*" : " ");
            }
        }
    }
}

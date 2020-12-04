package moe.yufan.study.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Write a code fragment to print the transposition (rows and columns changed) of a two-dimensional array
 * with M rows and N columns.
 *
 * @author せいうはん (Wesleysheng)
 * @version 1.0.0, 2020-12-04 22:03
 * @since 1.0.0, 2020-12-04 22:03
 */
public class TranspositionArray {

    public void transposition(int[][] arrays) {
        for (int i = 0; i < arrays[0].length; i++) {
            for (int[] array : arrays) {
                StdOut.print(array[i]);
                StdOut.print(" ");
            }
            StdOut.println();
        }
    }
}

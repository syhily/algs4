package moe.yufan.study.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Develop a better implementation of F(N) that saves computed values in an array.
 *
 * @author せいうはん (Wesleysheng)
 * @version 1.0.0, 2020-12-04 23:00
 * @since 1.0.0, 2020-12-04 23:00
 */
public class Fibonacci {

    private static final long[] RESULT_CACHE = new long[100];

    static {
        RESULT_CACHE[0] = 0;
        RESULT_CACHE[1] = 1;
    }

    public static long fib(int n) {
        if (n == 0 || n == 1) {
            return RESULT_CACHE[n];
        }

        if (n < RESULT_CACHE.length && RESULT_CACHE[n] > 0) {
            return RESULT_CACHE[n];
        }

        long result = fib(n - 1) + fib(n - 2);

        if (n < RESULT_CACHE.length) {
            RESULT_CACHE[n] = result;
        }

        return result;
    }

    // See 1.1.6
    public static long fib2(int n) {
        long a = 0;
        long b = 1;

        for (int i = 0; i < n; i++) {
            a += b;
            b = a - b;
        }

        return a;
    }

    public static void main(String[] args) {
        for (int n = 0; n < 100; n++) {
            StdOut.println(n + " " + fib(n));
            StdOut.println(n + " " + fib2(n));
        }
    }
}

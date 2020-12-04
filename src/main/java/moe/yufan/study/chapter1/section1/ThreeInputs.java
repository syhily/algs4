package moe.yufan.study.chapter1.section1;

import edu.princeton.cs.algs4.StdOut;
import lombok.experimental.UtilityClass;

/**
 * Write a program that takes three integer command-line arguments and prints equal if all three are equal,
 * and not equal otherwise.
 *
 * @author せいうはん (Wesleysheng)
 * @version 1.0.0, 2020-12-04 20:54
 * @since 1.0.0, 2020-12-04 20:54
 */
@UtilityClass
public class ThreeInputs {

    public static void main(String[] args) {
        if (args.length != 3) {
            StdOut.println("You should input three arguments");
            System.exit(-1);
        }

        // Parse args.
        int[] arguments = new int[3];
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            try {
                int argument = Integer.parseInt(arg);
                arguments[i] = argument;
            } catch (NumberFormatException e) {
                StdOut.printf("This argument %s is not a integer\n", arg);
                System.exit(-1);
            }
        }

        if (arguments[0] == arguments[1] && arguments[1] == arguments[2]) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }
}

import java.util.Scanner;

/**
 * The FibonacciSeries program implements an application that
 * finds the first nth term of Fibonacci Series.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class FibonacciSeries {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following value:");
        System.out.print("n =? "); int n = s.nextInt();
        int prevVal1 = 1, prevVal2 = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) System.out.println("        0\n        1");
            else {
                sum = prevVal1 + prevVal2;
                System.out.println(prevVal2 + " + " + prevVal1 + " = " + sum);
                prevVal2 = prevVal1;
                prevVal1 = sum;
            }
        }
    }
}

import java.util.Scanner;

/**
 * The RecursivePower program implements an application that
 * calculates power of a number using recursive function.
 *
 * @author S.Çapar
 * @version 1.0, 08/04/2022
 * @since 1.0
 */
public class RecursivePower {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following values:");
        System.out.print("Base  =? "); int base = s.nextInt();
        System.out.print("Power =? "); int power = s.nextInt();
        System.out.println("Result = " + recursivePower(base, power));
    }

    static int recursivePower(int base, int power) {
        if (power > 1) return recursivePower(base, power - 1) * base;
        else return base;
    }
}

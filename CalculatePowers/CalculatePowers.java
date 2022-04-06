import java.util.Scanner;

/**
 * The CalculatePowers program implements an application that
 * calculates the powers from 1 to N of numbers 4 and 5.
 *
 * @author S.Çapar
 * @version 1.0, 06/04/2022
 * @since 1.0
 */
public class CalculatePowers {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following value:");
        System.out.print("N = ? "); int n = s.nextInt();
        System.out.println("Powers of 4 from 1 to " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println("4^" + i + " => " + Math.pow(4, i));
        }
        System.out.println("Powers of 5 from 1 to " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println("5^" + i + " => " + Math.pow(5, i));
        }
    }
}

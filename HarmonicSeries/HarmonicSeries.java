import java.util.Scanner;

/**
 * The HarmonicSeries program implements an application that
 * calculates the sum of the harmonic series for nth term.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class HarmonicSeries {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following value:");
        System.out.print("N = ? "); int n = s.nextInt();

        double result = 0;
        for (int i = 1; i <= n; i++) result += 1.0 / i;

        System.out.println("Harmonic Series Sum = " + result);
    }
}

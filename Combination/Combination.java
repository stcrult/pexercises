import java.util.Scanner;

/**
 * The Combination program implements an application that
 * calculates Combination
 *
 * @author S.Çapar
 * @version 1.0, 06/04/2022
 * @since 1.0
 */
public class Combination {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following values:");
        System.out.print("n = ? ");int n = s.nextInt();
        System.out.print("r = ? ");int r = s.nextInt();

        int nFactorial = 1, rFactorial = 1, nrFactorial = 1;
        for (int i = 1; i <= n; i++) nFactorial *= i;
        for (int i = 1; i <= r; i++) rFactorial *= i;
        for (int i = 1; i <= (n-r); i++) nrFactorial *= i;
        double combination = nFactorial / (rFactorial * nrFactorial);
        System.out.println("C(" + n + "," + r + ") => " + combination);
    }
}

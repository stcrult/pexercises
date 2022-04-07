import java.util.Scanner;

/**
 * The ReverseTriangle program implements an application that
 * draws a reverse triangle from stars.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class ReverseTriangle {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following value");
        System.out.print("n =? ");int n = s.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2*i-1; j++) System.out.print("*");
            System.out.println();
        }
    }
}

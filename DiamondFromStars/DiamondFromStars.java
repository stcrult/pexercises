import java.util.Scanner;

/**
 * The DiamondFromStars program implements an application that
 * draws a diamond shape from stars.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class DiamondFromStars {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following value");
        System.out.print("N =? "); int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) System.out.print(" ");
            for (int j = 1; j <= 2*i-1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) System.out.print(" ");
            for (int j = 1; j <= 2*i-1; j++) System.out.print("*");
            System.out.println();
        }
    }
}

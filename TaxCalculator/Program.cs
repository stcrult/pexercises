import java.util.Scanner;
/**
 * The CalculateMean program implements an application that
 * calculates the tax and final price of a given price
 *
 * @author S.Çapar
 * @version 1.0, 05/04/2022
 * @since 1.0
 */

public class TaxCalculator {
    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter following value:");
        System.out.print("Price =? "); int price = s.nextInt();
        double tax = price <= 1000 ? 0.18 : 0.08;
        System.out.println("Tax          = " + (price * tax));
        System.out.println("Final Price  = " + (price * (1.0 + tax)));
    }
}

import java.util.Scanner;

/**
 * The GroceryCashier program implements an application that
 * calculates the total price for 5 products purchased from a Grocery
 * and prints the output on the screen.
 *
 * @author S.Çapar
 * @version 1.0
 * @since 2022-04-04
 */
public class GroceryCashier {

    /**
     * This is the main method
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float total = 0;
        System.out.println("Please enter how many kilos you buy for each fruit below: ");
        System.out.print("Armut         =? ");      total += s.nextFloat() * 2.14;
        System.out.print("Elma          =? ");      total += s.nextFloat() * 3.67;
        System.out.print("Domates       =? ");      total += s.nextFloat() * 1.11;
        System.out.print("Muz           =? ");      total += s.nextFloat() * 0.95;
        System.out.print("Patlıcan      =? ");      total += s.nextFloat() * 5.00;

        System.out.println("Total         = " + total);
    }
}

import java.util.Scanner;

/**
 * The CalculatePowerUsingForLoop program implements an application that
 * calculates power of a number using for loop.
 *
 * @author S.Çapar
 * @version 1.0, 06/04/2022
 * @since 1.0
 */
public class CalculatePowerUsingForLoop {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following values:");
        System.out.print("Number =? ");int number = s.nextInt();
        System.out.print("Power  =? ");int power = s.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) result *= number;
        System.out.println(number + "^" + power + " => " + result);
    }
}

import java.util.Scanner;

/**
 * The PerfectNumber program implements an application that
 * checks if a number is Perfect Number.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class PerfectNumber {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following value");
        System.out.print("Number =? "); int number = s.nextInt();

        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sumOfDivisors += i;
        }
        if (sumOfDivisors == number)
            System.out.println("Number " + number + " is a Perfect Number");
        else
            System.out.println("Number " + number + " is not a Perfect Number");
    }
}

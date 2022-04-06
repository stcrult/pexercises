import java.util.Scanner;

/**
 * The SumOfDigits program implements an application that
 * calculates the sum of the digits of the entered number.
 *
 * @author S.Çapar
 * @version 1.0, 06/04/2022
 * @since 1.0
 */
public class SumOfDigits {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter following value:");
        System.out.print("Number =? "); int number = s.nextInt();

        number = Math.abs(number);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits => " + sum);
    }
}

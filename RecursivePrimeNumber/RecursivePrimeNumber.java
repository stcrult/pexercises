import java.util.Scanner;

/**
 * The RecursivePower program implements an application that
 * checks if a given number is a Prime Number using recursive function.
 *
 * @author S.Çapar
 * @version 1.0, 09/04/2022
 * @since 1.0
 */
public class RecursivePrimeNumber {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following value:");
        System.out.print("Number =? "); int number = s.nextInt();
        boolean isPrime = false;

        System.out.print(number + " is ");
        if (isPrimeNumber(number)) System.out.println("a Prime Number");
        else System.out.println("not a Prime Number");
    }

    /**
     * Recursive function calculates how many divisors the number has
     * @param number Number
     * @param divisor Divisor
     * @return Number of divisors
     */
    static int numberOfDivisors(int number, int divisor) {
        if (divisor > 1) return (numberOfDivisors(number, divisor - 1) + (number % divisor == 0 ? 1 : 0));
        else return 1;
    }

    /**
     * Finds if a number is prime number
     * @param number Number
     * @return true if the number is prime number otherwise false
     */
    static boolean isPrimeNumber(int number) {
        if (numberOfDivisors(number, number)==2) return true;
        else return false;
    }
}

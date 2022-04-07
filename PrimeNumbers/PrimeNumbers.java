/**
 * The PrimeNumbers program implements an application that
 * finds the prime numbers between 1 and 100.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class PrimeNumbers {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++)
                if (i % j == 0) sum++;
            if (sum == 2 ) System.out.print(i + " ");
        }
    }
}

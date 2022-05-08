import java.util.Scanner;
/**
 * The NumbersDivisibleBy3and4 program implements an application that
 * finds the numbers divisible by 3 and 4.
 *
 * @author S.Çapar
 * @version 1.0, 08/05/2022
 * @since 1.0
 */

public class NumbersDivisibleBy3and4 {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter following values:");
        System.out.print("n =? "); int n = s.nextInt();
        System.out.println("Numbers divisible by 3 and 4:");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) System.out.println(i);
        }
    }
}

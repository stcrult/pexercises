import java.util.Scanner;

/**
 * The FindMinMax program implements an application that
 * calculates the minimum and maximum of entered numbers.
 *
 * @author S.Çapar
 * @version 1.0, 07/04/2022
 * @since 1.0
 */
public class FindMinMax {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the following value");
        System.out.print("How many number will you enter =? "); int n = s.nextInt();
        int number, min = 0, max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Number " + i + " =? ");
            number = s.nextInt();
            if (i == 1) min = max = number;
            if (min > number) min = number;
            if (max < number) max = number;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}

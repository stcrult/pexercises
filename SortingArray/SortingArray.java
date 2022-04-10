import java.util.Arrays;
import java.util.Scanner;

/**
 * The SortingArray program implements an application that
 * sorts the numbers in array from smallest to biggest.
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class SortingArray {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many numbers will you enter = ? "); int n = s.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Number =? "); numbers[i] = s.nextInt();
        }
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++)
            for (int j = i+1; j < n; j++)
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                    sorted = false;
                }
        System.out.println("Sorted Number  = " + Arrays.toString(numbers));
    }
}

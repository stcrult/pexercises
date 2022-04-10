 import java.util.Arrays;
import java.util.Scanner;

/**
 * The ClosestToNumber program implements an application that
 * finds the smallest and largest numbers closest to the entered number
 * from the numbers in an array.
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class ClosestToNumber {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int closestMin, closestMax, diffMin = 0, diffMax = 0;
        int[] numbers = {133,2,4,43,12,-34,94,8};

        System.out.println("Please enter the following value:");
        System.out.print("Number =? "); int number = s.nextInt();

        closestMax = closestMin = numbers[0];

        for (int i : numbers) {
            if (i > number) {
                if (diffMin == 0) {
                    diffMin = i - number;
                    closestMin = i;
                }else {
                    int diff = i - number;
                    if (diff > 0 && diff < diffMin) {
                        diffMin = diff;
                        closestMin = i;
                    }
                }
            }else if (i < number) {
                if (diffMax == 0) {
                    diffMax = number - i;
                    closestMax = i;
                }else {
                    int diff = number - i;
                    if (diff > 0 && diff < diffMax) {
                        diffMax = diff;
                        closestMax = i;
                    }
                }
            }
        }
        System.out.println("Number array           = " + Arrays.toString(numbers));
        System.out.println("Number                 = " + number);
        System.out.println("Minimum Closest Number = " + closestMin);
        System.out.println("Maximum Closest Number = " + closestMax);
    }
}

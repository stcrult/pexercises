 import java.util.Arrays;

/**
 * The RepeatingEvenNumbers program implements an application that
 * finds the repeating even numbers in a given array.
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class RepeatingEvenNumbers {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        int[] numbers = {2,2,1,43,3,2,4,24,4,54,1,6,23,65,23,56,24};
        int[] repeatingNumbers = new int[numbers.length];
        int repeatingIndex = 0;

        for (int i = 0; i < numbers.length - 1 ; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if ((! found(repeatingNumbers, numbers[i])) && numbers[i] % 2 == 0) {
                        repeatingNumbers[repeatingIndex++] = numbers[i];
                    }
                }
            }
        }
        System.out.println("Numbers array      =  " + Arrays.toString(numbers));
        System.out.println("Repeating Even numbers");
        for (int i = 0; i < repeatingIndex; i++) {
            System.out.println(repeatingNumbers[i]);
        }
    }

    static boolean found(int[] repeatingNumbers, int number) {
        for (int i : repeatingNumbers) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}

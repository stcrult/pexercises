import java.util.Arrays;

/**
 * The FrequencyDistribution program implements an application that
 * calculates the frequencies of numbers in an array.
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class FrequencyDistribution {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 2, 1, 5, 3, 1, 1, 1, 1, 4, 6, 9, 1, 3, 2, 6, 9, 7, 8, 4, 6, 4, 1, 1, 5, 2, 3, 4};
        int n = numbers.length;
        int[] frequencies = new int[n];
        int[] uniqueNumbers = new int[n];
        int frequencyIndex = 0;
        Arrays.sort(numbers);
        int prevVal = uniqueNumbers[0] = numbers[0];
        frequencies[frequencyIndex] = 1;
        for (int i = 1; i < n; i++) {
            if (numbers[i] == prevVal) {
                frequencies[frequencyIndex] += 1;
            }else{
                frequencyIndex++;
                frequencies[frequencyIndex] = 1;
                prevVal = uniqueNumbers[frequencyIndex] = numbers[i];

            }
        }
        System.out.println("   Number         Frequency   ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < frequencyIndex; i++) {
            System.out.print("    " + uniqueNumbers[i] + "                " + frequencies[i] + "      ");
            for (int j = 1; j <= frequencies[i]; j++) System.out.print("*");
            System.out.println();
        }
    }
}

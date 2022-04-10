/**
 * The HarmonicMean program implements an application that
 * calculates Harmonic Mean of the numbers given in the array.
 * an employee.
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class HarmonicMean {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        int[] numbers = {23, 1, 34, 2, 5, 65, 39};
        int numberOfObservations = numbers.length;
        double reciprocalSum = 0;
        for (int i : numbers) reciprocalSum += 1.0/i;
        double harmonicMean = numberOfObservations / reciprocalSum;
        System.out.println("Harmonic Mean = " + harmonicMean);
    }
}

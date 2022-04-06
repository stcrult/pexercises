import java.util.Scanner;

/**
 * The CalculateMean program implements an application that
 * calculates the mean value of numbers
 * from 1 to N divisible by 3 and 4
 *
 * @author S.Çapar
 * @version 1.0, 06/04/2022
 * @since 1.0
 */
public class CalculateMean {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter following value:");
        System.out.print("N =? "); int n = s.nextInt();
        int sum = 0, count = 0;
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        if (count > 0) {
            double mean = sum / count;
            System.out.println("Mean = " + mean);
        }else{
            System.out.println("No matching number found");
        }
    }
}

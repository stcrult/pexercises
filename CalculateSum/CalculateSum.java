import java.util.Scanner;

/**
 * The CalculateSum program implements an application that
 * calculates the sum of numbers divisible by 4
 * until an odd number entered
 *
 * @author S.Çapar
 * @version 1.0, 06/04/2022
 * @since 1.0
 */
public class CalculateSum {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0, number;
        do {
            System.out.print("Enter a number [odd number for finish] = ? ");
            number = s.nextInt();
            if (number % 4 == 0){
                sum += number;
            }
        }while (number % 2 == 0);
        System.out.println("Sum = " + sum);
    }
}

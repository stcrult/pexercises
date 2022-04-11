import java.util.Scanner;

/**
 * The NumberGuessingGame program is
 * a simple number guessing game
 *
 * @author S.Çapar
 * @version 1.0, 11/04/2022
 * @since 1.0
 */
public class NumberGuessingGame {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = (int)Math.round(Math.random() * 100);
        int trial = 0;
        while (true) {
            trial++;
            System.out.print("Enter your guess =? "); int guess = s.nextInt();
            if (number == guess) {
                System.out.println("Congratulations, you guessed right on the " + trial + ". try");
                break;
            }else if (number > guess) System.out.println("Increase");
            else System.out.println("Decrease");
        }
        s.close();
    }
}

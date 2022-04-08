import java.util.Scanner;

/**
 * The PalindromicNumber program implements an application that
 * checks if a given number is Palindromic Number.
 *
 * @author S.Çapar
 * @version 1.0, 08/04/2022
 * @since 1.0
 */
public class PalindromicNumber {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        do {
            System.out.print("Please enter a number [0 for exit] =? ");
            number = s.nextInt();
            if (number > 0)
                System.out.println("Number " + number + " is " + (isPalindromicNumber(number) ? "Palindromic":"not Palindromic"));
        }
        while (number > 0);
    }

    static boolean isPalindromicNumber(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp > 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number) return true;
        else return false;
    }
}

import java.util.Scanner;

/**
 * The PalindromeWord program implements an application that
 * checks if a given word is a Palindrome word.
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class PalindromeWord {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your word [exit to Exit] =? ");
            String word = s.nextLine();
            if (word.equals("exit")) break;
            int wordLength = word.length();
            int halfLength = wordLength / 2;
            boolean isPalindrome = true;
            for (int i = 0; i < halfLength; i++)
                if (word.charAt(i) != word.charAt(wordLength - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            if (isPalindrome) System.out.println("Palindrome");
            else System.out.println("not Palindrome");
        }
        s.close();
    }
}

import java.util.Scanner;

/**
 * The ChineseZodiac program implements an application that
 * determines the Chinese Zodiac from birth year.
 *
 * @author S.Çapar
 * @version 1.0, 06/04/2022
 * @since 1.0
 */
public class ChineseZodiac {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the following value");
        System.out.print("Birth Year =? "); int year = s.nextInt();
        int result = year % 12;
        String zodiac = "";
        switch (result){
            case 0: zodiac = "Monkey";break;
            case 1: zodiac = "Rooster";break;
            case 2: zodiac = "Dog";break;
            case 3: zodiac = "Pig";break;
            case 4: zodiac = "Rat";break;
            case 5: zodiac = "Ox";break;
            case 6: zodiac = "Tiger";break;
            case 7: zodiac = "Rabbit";break;
            case 8: zodiac = "Dragon";break;
            case 9: zodiac = "Snake";break;
            case 10: zodiac = "Horse";break;
            case 11: zodiac = "Ewe";break;
            default: zodiac = "Error: Zodiac not determined";
        }

        System.out.println("Zodiac = " + zodiac);
    }
}

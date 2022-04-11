import java.util.Scanner;

/**
 * The TextBasedMineSweeper program is
 * a Text Based Mine Sweeper game.
 *
 * @author S.Çapar
 * @version 1.0, 11/04/2022
 * @since 1.0
 */
public class TextBasedMineSweeper {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        MineSweeper mineSweeper = new MineSweeper();

        int x, y;
        while (true) {
            mineSweeper.printMatrix();
            while (true) {
                System.out.print("Enter the coordinate =? ");
                int coordinate = s.nextByte();
                if (coordinate < 11 || coordinate > 99)
                    System.out.println("Wrong coordinate. Enter like 11  or 23 (rowcol)");
                else {
                    y = coordinate % 10;
                    x = (coordinate - y) / 10;
                    break;
                }
            }

            if (mineSweeper.endOfGame(x, y)) {
                if (mineSweeper.isWin) System.out.println("Congratulations , You won.");
                else System.out.println("Sorry, You lost.");
                break;
            }
        }
    }
}

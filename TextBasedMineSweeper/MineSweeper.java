import java.util.Random;

/**
 * The TextBasedMineSweeper program is
 * a Text Based Mine Sweeper game.
 *
 * @author S.Çapar
 * @version 1.0, 11/04/2022
 * @since 1.0
 */

public class MineSweeper {
    int row=4, col=7;
    String[][] matrix = new String[row][col];
    int[][] mines = new int[row][col];
    int numberOfMines;
    int numberOfFields;
    int numberOfTrials;
    boolean isWin;

    public MineSweeper() {
        initializeMatrix();
    }

    public MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        initializeMatrix();
    }

    public void initializeMatrix() {
        numberOfMines = (int)(row * col * 0.3);
        numberOfFields = row * col - numberOfMines;
        numberOfTrials = 0;
        matrix = new String[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                matrix[i][j] = "#";
                mines[i][j] = 0;
            }
        initializeMines();
    }

    public void initializeMines() {
        Random random = new Random();
        int totalMines = 0;
        while (true) {
            if (totalMines == numberOfMines) break;
            int i = random.nextInt(row - 1);
            int j = random.nextInt( col - 1);
            if (mines[i][j] == 0) {
                totalMines++;
                mines[i][j] = 1;
            }
        }

    }

    public boolean endOfGame(int x, int y) {
        x--; y--;
        if (checkMine(x,y)) {
            isWin = false;
            return true;
        }
        if (numberOfTrials + 1 >= numberOfFields) {
            isWin = true;
            return true;
        }
        checkMatrix(x,y);
        numberOfTrials++;
        return false;
    }

    public void checkMatrix(int x, int y) {
        int foundMines = 0;
        for (int i = x-1; i <= x+1; i++) {
            for (int j = y-1; j<= y+1; j++) {
                if (i>=0 && i<row && j>=0 && j<col) {
                    if (mines[i][j]==1) foundMines++;
                }
            }
        }
        matrix[x][y] = String.valueOf(foundMines);
    }

    public boolean checkMine(int x, int y) {
        if  (mines[x][y] == 1) return true;
        return false;
    }

    public void printMatrix() {
        for (String[] i : matrix) {
            for (String j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
    public void printMines() {
        for (int[] i : mines) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}

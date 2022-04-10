/**
 * The MatrixTranspose program implements an application that
 * takes the transpose of a matrix.
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class MatrixTranspose {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {
        int[][] matrix = { {1,2,3}, {4,5,6} };
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrix");
        printMatrix(matrix);
        System.out.println("Transpose");
        printMatrix(transpose);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) System.out.print(j + " ");
            System.out.println();
        }
    }
}

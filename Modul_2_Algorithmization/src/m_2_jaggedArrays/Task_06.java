package m_2_jaggedArrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *               1 1 1 .... 1 1 1
 *               0 1 1 .... 1 1 0
 *               0 0 1 .... 1 0 0
 *               ................
 *               0 0 1 .... 1 0 0
 *               0 1 1 .... 1 1 0
 *               1 1 1 .... 1 1 1
 */

public class Task_06 {

    public static void main(String[] args) {

        int n = 8;

        if (n % 2 == 0) {

            int[][] matrix = new int[n][n];

            for (int i = 0; i < matrix.length / 2; ++i) {
                for (int j = i; j < n - i; j++) {
                    matrix[i][j] = 1;
                    matrix[matrix.length - i - 1][j] = 1;
                }
            }

            for (int i = 0; i < matrix.length; i++, System.out.println())
                for (int j = 0; j < matrix[i].length; j++)
                    System.out.print(matrix[i][j] + " ");
        } else {
            System.out.println("Некорректные данные");
        }
    }
}
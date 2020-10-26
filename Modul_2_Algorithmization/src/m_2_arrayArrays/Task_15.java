package m_2_arrayArrays;

import java.util.Arrays;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task_15 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 99, 18, 15},
                          {0, 2, 14, 12},
                          {50, 4, 39, 21},
                          {67, 3, 13, 6}};

        swap(matrix, max(matrix));
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }

    private static int max(int[][] matrix) {
        int max = 0;
        for (int[] array : matrix) {
            max = Math.max(max, Arrays.stream(array).max().getAsInt());
        }
        return max;
    }

    private static void swap(int[][] matrix, int max) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0)
                    matrix[i][j] = max;
            }
        }
    }
}
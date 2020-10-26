package m_2_arrayArrays;

import java.util.Arrays;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class Task_14 {

    public static void main(String[] args) {

        int m = 7;
        int n = 7;

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;

            for (int j = 0; j < matrix.length; j++) {
                int number = (int) Math.round(Math.random() * (i + 1));

                if (number >= 1 && count < (i + 1)) {
                    matrix[j][i] = 1;
                    count++;
                } else {
                    matrix[j][i] = 0;
                }
            }

            if (count != (i + 1))
                i -= 1;
        }

        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}
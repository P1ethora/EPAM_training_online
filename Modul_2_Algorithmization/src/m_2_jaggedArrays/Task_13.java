package m_2_jaggedArrays;

import java.util.Arrays;

/**
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов
 */

public class Task_13 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 11, 111, 101},
                          {8, 88, 4, 2},
                          {31, 9, 0, 7},
                          {4, 5, 14, 10}};
        System.out.println("По возрастанию:");
        increase(matrix);
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("По убыванию:");
        decrease(matrix);
        for (int[] a : matrix) {
            System.out.println(Arrays.toString(a));
        }
    }

    private static void decrease(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int m = 0;

            while (m < matrix.length - 1) {

                int minIndex = m;
                int minValue = matrix[m][i];

                for (int j = m + 1; j < matrix.length; j++) {

                    if (matrix[j][i] > minValue) {
                        minValue = matrix[j][i];
                        minIndex = j;
                    }
                }

                if (minIndex != m) {
                    matrix[minIndex][i] = matrix[m][i];
                    matrix[m][i] = minValue;
                }
                m++;
            }
        }
    }

    private static void increase(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int m = 0;

            while (m < matrix.length - 1) {

                int maxIndex = m;
                int maxElement = matrix[m][i];

                for (int j = m + 1; j < matrix.length; j++) {

                    if (matrix[j][i] < maxElement) {
                        maxElement = matrix[j][i];
                        maxIndex = j;
                    }
                }

                if (maxIndex != m) {
                    matrix[maxIndex][i] = matrix[m][i];
                    matrix[m][i] = maxElement;
                }
                m++;
            }
        }
    }
}
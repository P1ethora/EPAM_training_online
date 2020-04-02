package m_2_jaggedArrays;

import java.util.Random;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

public class Task_11 {

    public static void main(String[] args) {
        int[][] matrix = new int[10][20];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(16);
            }
        }
        int i = 0;
        while (i < matrix.length) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            i++;
            System.out.println();
        }
        row(matrix);
    }

    private static void row(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println("Строка " + (i + 1));
            }
        }
    }
}
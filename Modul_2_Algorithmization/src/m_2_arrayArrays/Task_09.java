package m_2_arrayArrays;

/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

public class Task_09 {

    public static void main(String[] args) {
        int max = -1;
        int sum = 0;

        int[][] matrix = {{1, 2, 3, 1},
                          {1, 2, 3, 1},
                          {1, 2, 3, 1},
                          {1, 2, 3, 1}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[j][i];
            }
            if (sum > max) {
                max = sum;
            }
            System.out.print(sum + " ");
            sum = 0;
        }
        System.out.println("\n" + "Максимальная сумма " + max);
    }
}
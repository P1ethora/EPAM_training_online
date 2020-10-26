package m_2_arrayArrays;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task_03 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 1},
                          {2, 2, 2, 2},
                          {3, 3, 3, 3},
                          {3, 3, 3, 3}};

        row(matrix, 1 /*new Scanner(System.in).nextInt()*/); //начальное значение с 0
        System.out.println(/*Enter*/);
        column(matrix, 3 /*new Scanner(System.in).nextInt()*/);
    }

    private static void row(int[][] matrix, int row) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[row][i] + " ");
        }
    }

    private static void column(int[][] matrix, int column) {
        for (int[] ints : matrix) {
            System.out.println(ints[column]);
        }
    }
}

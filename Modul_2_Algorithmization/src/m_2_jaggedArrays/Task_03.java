package m_2_jaggedArrays;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task_03 {

    public static void main(String[] args) {
        int[][] list = {{1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4}};

        int row = 1;
        int column = 3;

        for (int i = 0; i < list.length; i++, System.out.println()) {
            System.out.print(list[row][i] + " ");
        }

        for (int[] a : list) {
            if (a.length > column) {
                System.out.print(a[column] + " ");
            }
        }
    }
}
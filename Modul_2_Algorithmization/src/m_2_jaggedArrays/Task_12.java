package m_2_jaggedArrays;

import java.util.Arrays;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов
 */

public class Task_12 {

    public static void main(String[] args) {

        Integer[][] matrix = new Integer[][]{{35, 25, 55},
                                             {35, 25, 55},
                                             {35, 25, 55}};

        System.out.println("По возрастанию:");
        for (Integer[] i : matrix) {
            Arrays.sort(i);
            System.out.println(Arrays.toString(i));
        }

        System.out.println("По убыванию:");
        for (Integer[] j : matrix) {
            Arrays.sort(j, (x1, x2) -> {

                if (x1 < x2) return 1;
                if (x1 > x2) return -1;
                return 0;

            });
        }

        for (Integer[] integers : matrix) System.out.println(Arrays.toString(integers));
    }
}
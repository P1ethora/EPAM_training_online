package m_2_arrayArrays;

import java.util.Arrays;
import java.util.Comparator;

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
            Arrays.sort(j, Comparator.reverseOrder());
        }

        for (Integer[] integers : matrix) System.out.println(Arrays.toString(integers));
    }
}
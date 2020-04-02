package m_1_linearArrays;

import java.util.Arrays;

/**
 * Дана последовательность целых чисел (a₁,a₂,...,aₙ).
 * Образовать новую последовательность, выбросив из данной min(a₁,a₂,...,aₙ)
 */

public class Task_08 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] list2 = newValues(list);
        System.out.println(Arrays.toString(list2));

    }

    private static int[] newValues(int[] list) {
        int min = min(list);
        int[] list2 = new int[list.length - delMin(list, min)];
        int ind = 0;

        for (int i1 : list) {
            if (i1 != min) {
                list2[ind] = i1;
                ind++;
            }
        }
        return list2;
    }

    private static int min(int[] list) {
        int min = list[0];

        for (int i1 : list)
            if (i1 < min)
                min = i1;
        return min;
    }

    private static int delMin(int[] a, int min) {
        int count = 0;

        for (int i : a)
            if (i == min)
                count++;
        return count;
    }
}
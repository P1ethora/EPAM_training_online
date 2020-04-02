package m_3_sortingArrays;

import java.util.Arrays;

/**
 * Сортировка выбором. Дана последовательность чисел a1 < a2 < ... < an.Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

public class Task_3 {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i; j < list.length; j++) {
                if (list[j] > list[min]) {
                    min = j;
                }
            }
            swap(list, i, min);
        }
        System.out.println(Arrays.toString(list));

    }

    private static void swap(int[] list, int a, int b) {
        int tmp = list[a];
        list[a] = list[b];
        list[b] = tmp;
    }
}
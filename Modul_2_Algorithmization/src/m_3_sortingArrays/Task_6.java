package m_3_sortingArrays;

import java.util.Arrays;

/**
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai < ai+1,
 * то продвигаютсяна один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются
 * на один элемент назад.Составить алгоритм этой сортировки.
 */

public class Task_6 {

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
        int value = array.length / 2;
        while (value >= 1) {
            for (int i = 0; i < array.length; i++) {

                for (int j = i - value; j >= 0; j -= value) {
                    if (array[j] > array[j + value]) {
                        swap(array, j, j + value);
                    }
                }
            }
            value /= 2;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}

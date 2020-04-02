package m_1_linearArrays;

import java.util.Arrays;

/**
 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task_10 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        int size = list.length % 2 == 0 ? list.length / 2 : list.length / 2 + 1;

        for (int c = 1; c < size; c++) {
            list[c] = list[2 * (c)];
        }
        for (int i = size; i < list.length; i++) {
            list[i] = 0;
        }

        System.out.println(Arrays.toString(list));
    }
}
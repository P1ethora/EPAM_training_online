package m_3_sortingArrays;

import java.util.Arrays;

/**
 * Сортировка вставками. Дана последовательность чисел a1, a2 ... an. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть a1, a2 ... ai - упорядоченная последовательность, т. е.
 * a1 < a2 < ... < an. Берется следующее число a(i + 1) и вставляется в последовательность так, чтобы новая
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Task_5 {

    public static void main(String[] args) {

        int[] list = {10, 9, 8, 3, 1, 2, 5};
        System.out.println(Arrays.toString(list));
        for (int left = 0; left < list.length; left++) {

            int value = list[left];

            int i = left - 1;
            for (; i >= 0; i--) {

                if (value < list[i]) {
                    list[i + 1] = list[i];
                } else {
					
                    break;
                }
            }
            list[i + 1] = value;
        }
        System.out.println(Arrays.toString(list));
    }
}
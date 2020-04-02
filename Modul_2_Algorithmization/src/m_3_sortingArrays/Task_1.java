package m_3_sortingArrays;

import java.util.Arrays;

/**
 *  Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 *  один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 *  дополнительный массив.
 */
public class Task_1 {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 1, 1};
        int[] b = {9, 9, 9, 9, 9};
        int k = 2;

        a = Arrays.copyOf(a, a.length + b.length);

        for (int i = a.length - b.length - 1; i >= k - 1; i--) {
            a[b.length + i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            a[k + i - 1] = b[i];
        }
        System.out.println(Arrays.toString(a));
    }
}
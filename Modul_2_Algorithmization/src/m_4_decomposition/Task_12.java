package m_4_decomposition;

import java.util.Arrays;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task_12 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(result(10, 100)));
    }

    private static int[] result(int k, int n) {
        if (k == 0) {
            return new int[]{0};
        }

        int[] list = new int[10];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (sumNumb(i) == k) {
                if (j == list.length - 1) {
                    list = growArr(list);
                }
                list[j] = i;
                j++;
            }
        }
        return reduceArr(list);
    }

    private static int sumNumb(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    private static int[] growArr(int[] arr) {
        int length = arr.length * 2 + 1;
        return (copy(arr, length));
    }

    private static int[] reduceArr(int[] arr) {
        int length = arr.length - 1;
        while (arr[length] == 0)
            length--;
        return (copy(arr, length));
    }

    private static int[] copy(int[] arr, int newL) {
        int[] newArr = new int[newL];

        if (arr.length < newL) {
            System.arraycopy(arr, 0, newArr, 0, arr.length);
        } else {
            System.arraycopy(arr, 0, newArr, 0, newL);
        }
        return newArr;
    }
}
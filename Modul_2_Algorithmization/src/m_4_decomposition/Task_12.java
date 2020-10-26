package m_4_decomposition;

import java.util.Arrays;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task_12 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(result(15, 125)));
    }

    private static int[] result(int k, int n) {
//        if (k == 0) {
//            return new int[]{0};     //небольшая проверока на ввод
//        }

        int[] list = new int[10];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (sumNumber(i) == k) {
                if (j == list.length - 1) {
                    list = increaseArr(list);
                }
                list[j] = i;
                j++;
            }
        }
        return reductionArr(list);
    }

    private static int sumNumber(int i) {     //сумма чисел 123 (1+2+3 и тд)
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    private static int[] increaseArr(int[] arr) {     //увеличение массива
        return (createNewArray(arr, arr.length * 2 + 1));
    }

    private static int[] reductionArr(int[] arr) {   //Уменьшение массива
        int length = arr.length;
        while (arr[length - 1] == 0)
            length--;
        return (createNewArray(arr, length));
    }

    private static int[] createNewArray(int[] arr, int newL) {         //создание нового массива
        int[] newArr = new int[newL];
        System.arraycopy(arr, 0, newArr, 0, Math.min(arr.length, newL));
        return newArr;
    }
}
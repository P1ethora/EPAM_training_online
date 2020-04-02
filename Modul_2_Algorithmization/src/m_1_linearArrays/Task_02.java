package m_1_linearArrays;

import java.util.Arrays;

/**
 * Дана последовательность действительных чисел a₁,a₂,...,aₙ. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

public class Task_02 {

    public static void main(String[] args) {

        double[] list = {1, 2, 3, 4, 5};
        double z = 3;

        changeNumb(list, z);

    }

    private static void changeNumb(double[] list, double z) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > z) {
                list[i] = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(list) + "\n" + "Количество замен: " + count);

    }
}
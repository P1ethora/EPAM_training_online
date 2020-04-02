package m_1_linearArrays;

import java.util.Arrays;

/**
 * Даны действительные числа a₁,a₂,...,aₙ . Поменять местами наибольший и наименьший элементы.
 */

public class Task_04 {

    public static void main(String[] args) {
        double[] list = {999, 9, 15, 888, 0, 1, 78, 17};
        swap(list);
        System.out.println(Arrays.toString(list));

    }

    private static void swap(double[] array) {
        int IndMin = 0;
        int IndMax = 0;

        double minNumb = array[0];
        double maxNumb = array[0];

        for (int i = 1; i < array.length; i++) {

            if (minNumb > array[i]) {
                minNumb = array[i];
                IndMin = i;

            } else if (maxNumb < array[i]) {
                maxNumb = array[i];
                IndMax = i;
            }
        }

        array[IndMax] = minNumb;
        array[IndMin] = maxNumb;
    }

}
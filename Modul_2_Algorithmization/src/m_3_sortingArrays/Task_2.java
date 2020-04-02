package m_3_sortingArrays;

import java.util.Arrays;

/**
 * Даны две последовательности a1<a2<...<an и b1<b2<...<bn. Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task_2 {

    public static void main(String[] args) {

        int[] array1 = {2, 4, 6, 8, 10, 12, 14};
        int[] array2 = {1, 3, 5, 7, 9, 11, 13};

        int index = 0;
        int count1 = 0;
        int count2 = 0;
        int[] newLength = new int[array1.length + array2.length];
        while (true) {
            if (count1 != array1.length && count2 != array2.length) {
                if (array1[count1] >= array2[count2]) {
                    newLength[index++] = array2[count2++];
                } else if ((array1[count1] < array2[count2])) {
                    newLength[index++] = array1[count1++];
                }
            } else {
                if (count1 != array1.length) {
                    for (int i = count1; i < array1.length; i++) {
                        newLength[index++] = array1[i];
                    }
                } else {
                    for (int i = count2; i < array2.length; i++) {
                        newLength[index++] = array2[i];
                    }
                }
            }
            if (index == newLength.length) {
                array1 = newLength;
                break;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
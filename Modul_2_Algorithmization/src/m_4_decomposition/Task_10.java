package m_4_decomposition;

import java.util.Arrays;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N
 */

public class Task_10 {

    public static void main(String[] args) {
        int numb = 1234567890;
        System.out.println(Arrays.toString(formArray(numb)));
    }

    private static int[] formArray(int n) {
        int[] list = new int[String.valueOf(n).length()];
        for (int i = list.length - 1; i > -1; i--) {
            list[i] = n % 10;
            n /= 10;
        }
        return list;
    }
}
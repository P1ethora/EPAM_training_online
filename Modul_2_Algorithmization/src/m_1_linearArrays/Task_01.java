package m_1_linearArrays;

import java.util.Scanner;

/**
 * В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task_01 {

    public static void main(String[] args) {

        System.out.print(sum(new int[] {10, 25, 38, 21, 6},
                         new Scanner(System.in).nextInt()));
    }

    private static int sum(int[] array, int number) {
        int sum = 0;
        for (int i : array) {
            if (i % number == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
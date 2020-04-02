package m_1_linearArrays;

/**
 * В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task_01 {

    public static void main(String[] args) {
        int[] array = {10, 25, 38, 21, 6};
        int k = 2;
        sum(array, k);
    }

    private static void sum(int[] array, int k) {
        int sum = 0;

        for (int i1 : array) {
            if (i1 % k == 0) {
                sum += i1;
            }
        }

        System.out.print("Сумма = " + sum);
    }
}
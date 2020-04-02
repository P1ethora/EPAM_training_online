package m_1_linearArrays;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Task_06 {

    public static void main(String[] args) {

        double[] list = {1.1, 2, 3.3, 4.4, 5.5, 6, 7.7, 8, 9};
        double sum = 0;

        next:
        for (int i = 2; i < list.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue next;
                }
            }
            sum += list[i];
        }
        System.out.println(sum);
    }
}
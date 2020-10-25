package m_1_linearArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Task_06 {

    public static void main(String[] args) {
                                //2    3        5       7      <-- простые числа
        double[] list = {1.1, 2, 3.3, 4.4, 5.5, 6, 7.7, 8, 9};
        double sum = 0;

        for (int i = 3; i < list.length; i++) {
            if (i % 2 != 0) sum += list[i];
        }
        System.out.println(sum);

//        next:                                             //более интересная реализация
//        for (int i = 2; i < list.length; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    continue next;                        //выбрасываем значение из внешнего цикла
//                }
//        }
//            sum += list[i];
//        }
    }
}
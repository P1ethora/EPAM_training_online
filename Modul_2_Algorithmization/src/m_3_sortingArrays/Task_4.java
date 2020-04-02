package m_3_sortingArrays;

import java.util.Arrays;

/**
 * Сортировка обменами. Дана последовательность чисел a1 < a2 < ... < an.Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai, a(i+1). Если ai > ai+1, то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
//Условия протеворечивы!
public class Task_4 {

    public static void main(String[] args) {
        int[] a = {100, 10, 12, 15, 80};
        System.out.println(Arrays.toString(sort(a)));
    }

    private static int[] sort(int[] a) {
        int swap = 0;
        for (int i = 0; i < a.length; i++) {
            int itr = 0;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    itr++;
                }
            }
            if (itr == 0) break;
            swap += itr;
        }
        System.out.println("Количество перестановок: " + swap);
        return a;
    }
}
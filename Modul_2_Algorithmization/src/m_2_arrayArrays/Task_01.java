package m_2_arrayArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

public class Task_01 {

    public static void main(String[] args) {

        int[][] list = new int[5][5];

        for (int[] array: list) {
            Arrays.setAll(array, i -> (int) (Math.random() * 100));
            System.out.println(Arrays.toString(array));
        }

        output(list);
    }

    private static void output(int[][] list) {

        for (int[] array:list) {
            IntStream.range(0, list.length)
                    .filter(i -> array[0]>array[array.length-1])
                    .mapToObj(i -> array[i]).forEach(System.out::print);
        }

        for (int i = 1; i < list.length; i += 2) {
            if (list[0][i] > list[list[i].length - 1][i]) {
                for (int a = 0; a < list[i].length; a++) {
                    System.out.print(list[a][i] + " ");
                }
            }
        }
    }
}
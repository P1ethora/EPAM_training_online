package m_2_jaggedArrays;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

public class Task_01 {

    public static void main(String[] args) {

        int[][] list = new int[5][5];
        for (int i = 0; i < list.length; i++) {
            for (int a = 0; a < list[i].length; a++) {
                list[i][a] = (int) (Math.random() * 100);
            }
        }
        output(list);
    }

    private static void output(int[][] list) {
        for (int i = 1; i < list.length; i += 2) {
            if (list[0][i] > list[list[i].length - 1][i]) {
                for (int a = 0; a < list[i].length; a++) {
                    System.out.print(list[a][i] + " ");
                }
            }
        }
    }
}
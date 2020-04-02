package m_2_jaggedArrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *             1 1 1 1 .... 1
 *             2 2 2 2 .... 0
 *             3 3 3 0 .... 0
 *             ..............
 *             n 0 0 0 .... 0
 */

public class Task_05 {

    public static void main(String[] args) {

        int n = 6;

        if (n % 2 == 0) {

            int[][] list = new int[n][n];

            for (int i = 0; i < n; i++, System.out.println()) {
                for (int j = 0; j < n - i; j++) {
                    list[i][j] = i + 1;
                    System.out.print(list[i][j] + " ");
                }
                for (int j = n - i; j < n; j++) {
                    list[i][j] = 0;
                    System.out.print(list[i][j] + " ");
                }
            }
        } else {
            System.out.println("Неверный формат");
        }
    }
}
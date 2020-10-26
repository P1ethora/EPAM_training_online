package m_2_arrayArrays;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *            1  2   3   .... n
 *            n  n-1 n-2 .... n
 *            1  2   3   .... n
 *            n  n-1 n-2 .... n
 *            .................
 *            n  n-1 n-2 .... n
 */

public class Task_04 {

    public static void main(String[] args) {

        int n = 6;
//      int n = new Scanner(System.in).nextInt();

        if (n % 2 == 0) {  //или сюда - Scanner
            int[][] list = new int[n][n];

            for (int i = 0; i < n; i++,System.out.println()) {
                for (int a = 0; a < n; a++) {

                    if (i % 2 == 0) {
                        list[i][a] = a + 1;
                        System.out.print(list[i][a] + " ");
                    } else {
                        list[i][a] = n - a;
                        System.out.print(list[i][a] + " ");
                    }
                }
            }
        } else {
            System.out.print("Неверный формат");
        }
    }
}
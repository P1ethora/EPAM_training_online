package m_2_jaggedArrays;

/**
 * Магическим квадратом порядка n называется квадратная матрица n*n составленная из чисел 1,2,3,...,n², так,
 * что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
 * Пример магического квадрата порядка 3:
 *                   6 1 8
 *                   7 5 3
 *                   2 9 4
 */

public class Task_16 {
    public static void main(String[] args) {

        int n = 4;

        int[][] square;

        if ((n - 1) % 2 == 0) {
            square = scenarioOdd(n);
        } else if (n % 4 == 0) {
            square = scenario(n);
        } else {
            square = scenarioOddEvent(n);
        }
        print(square);
    }

    private static int[][] scenarioOdd(int n) {
        int[][] square = new int[n][n];
        int i = 0;
        int j = (n - 1) / 2;
        square[i--][j++] = 1;
        for (int k = 2; k <= n * n; i--, j++, k++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (square[i][j] != 0) {
                i += 2;
                j--;
            }
            square[i][j] = k;
        }
        return square;
    }

    private static int[][] scenario(int n) {
        int[][] square = new int[n][n];
        int t = 1;

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                square[i][j] = t;
                t++;
            }
        }

        for (int i = 0; i < n; i += 4) {
            for (int j = 1; j < n; j += 4) {
                square[i][j] = n * n + 1 - square[i][j];
                square[i + 3][j] = n * n + 1 - square[i + 3][j];
                square[i][j + 1] = n * n + 1 - square[i][j + 1];
                square[i + 3][j + 1] = n * n + 1 - square[i + 3][j + 1];
            }
        }
        for (int i = 1; i < n; i += 4) {
            for (int j = 0; j < n; j += 4) {
                square[i][j] = n * n + 1 - square[i][j];
                square[i + 1][j] = n * n + 1 - square[i + 1][j];
                square[i][j + 3] = n * n + 1 - square[i][j + 3];
                square[i + 1][j + 3] = n * n + 1 - square[i + 1][j + 3];
            }
        }
        return square;
    }

    private static int[][] scenarioOddEvent(int n) {
        int[][] square = new int[n][n];
        int[][] squareT = scenario(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                square[i][j] = squareT[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int l = n / 2;
        int d = n * n + 1;

        square[0][0] = 3 * l - 1;
        square[0][n - 1] = 1;
        square[n - 1][0] = d - 1;
        square[n - 1][n - 1] = d - 3 * l + 1;

        int i, j;
        for (i = 1; i <= l - 2; i++) {
            square[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= l; j++) {
            square[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            square[n - 1][j] = n * n + 1 - square[0][j];
        }
        square[1][0] = 2 * l - 1;
        for (i = 1; i <= l / 2; i++) {
            square[i + 1][0] = 3 * l - 1 - i;
        }
        i--;
        for (j = 1; j <= l / 2 + 1; j++) {
            square[i + j + 1][0] = d - 4 * l + 1 + j;
        }
        j--;
        for (int q = 1; q <= l / 2 - 1; q++, i++) {
            square[i + j + q + 1][0] = 3 * l - 1 + q;
            square[i + j + q + 2][0] = d - 2 * l - q;
        }

        for (i = 1; i < n - 1; i++) {
            square[i][n - 1] = n * n + 1 - square[i][0];
        }

        return square;
    }

    private static void print(int[][] square) {
        for (int[] array : square) {
            for (int element : array) {
                System.out.print(element + "    ");
            }
            System.out.println("\n");
        }
    }
}
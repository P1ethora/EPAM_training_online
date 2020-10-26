package m_2_arrayArrays;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I² - J²) / N)
 * и подсчитать количество положительных элементов в ней
 */

public class Task_07 {

    public static void main(String[] args) {

        int n = 5;

        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++, System.out.println()) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                System.out.print(matrix[i][j] + "  ");
            }
        }
        System.out.println("Количество положительных элементов: " + elements(matrix));
    }

    private static int elements(double[][] matrix) {
        int elem = 0;
        for (double[] m : matrix) {
            for (double v : m) {
                if (v > 0)
                    elem++;
            }
        }
        return elem;
    }
}
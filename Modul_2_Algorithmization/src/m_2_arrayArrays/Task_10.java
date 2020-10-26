package m_2_arrayArrays;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task_10 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {1, 2, 3, 4},
                          {1, 2, -3, 4},
                          {1, 2, 3, 4}};
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0)
                System.out.println(matrix[i][i]);
        }
//        IntStream.range(0,matrix.length)
//                .filter(i-> matrix[i][i] > 0)
//                .mapToObj(i -> matrix[i][i])
//                .forEach(System.out::println);
    }
}
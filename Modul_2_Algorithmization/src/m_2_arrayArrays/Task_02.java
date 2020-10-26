package m_2_arrayArrays;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task_02 {

    public static void main(String[] args) {
        int[][] list = {{1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4},
                        {1, 2, 3, 4}};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i][i]);
        }
    }
}
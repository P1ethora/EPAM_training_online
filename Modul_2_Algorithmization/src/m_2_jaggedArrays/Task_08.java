package m_2_jaggedArrays;

import java.util.Scanner;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

public class Task_08 {

    public static void main(String[] args) {

        int firstColumn = input("first");
        int secondColumn = input("second");

        int[][] matrix = {{1, 2, 3, 4, 5},
                          {1, 2, 3, 4, 5},
                          {1, 2, 3, 4, 5},
                          {1, 2, 3, 4, 5},
                          {1, 2, 3, 4, 5}};

        if (firstColumn >= matrix[0].length || secondColumn >= matrix[0].length ||
                firstColumn < 0 || secondColumn < 0) {
            System.out.println("Замена невозможна");

        } else {
            for (int j = 0; j < matrix.length; j++) {
                for (int i = 0; i < matrix.length; i++) {
                    int temp = matrix[i][firstColumn - 1];
                    matrix[i][firstColumn - 1] = matrix[i][secondColumn - 1];
                    matrix[i][secondColumn - 1] = temp;
                }
            }
            for (int i = 0; i < matrix.length; i++, System.out.println()) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    private static int input(String column) {
        System.out.print("Enter " +column+ " column: ");
        return new Scanner(System.in).nextInt();
    }
}
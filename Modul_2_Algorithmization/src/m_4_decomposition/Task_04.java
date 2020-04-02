package m_4_decomposition;

import java.util.Arrays;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Task_04 {

    public static void main(String[] args) {

        int[][] points = {{0, 1}, {9, 15}, {4, -6}, {-15, 3}};
        int[] pointsDistance = max(points);
        System.out.println("Наибольшая дистанция между " + Arrays.toString(points[pointsDistance[0]]) + " и "
                + Arrays.toString(points[pointsDistance[1]]));
    }

    private static int[] max(int[][] array) {
        double maxL = 0;
        double length;
        int[] rooms = new int[2];

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                length = getDistance(array[i][0], array[i][1], array[j][0], array[j][1]);
                if (length > maxL) {
                    maxL = length;
                    rooms[0] = i;
                    rooms[1] = j;
                }
            }
        }
        return rooms;
    }

    private static double getDistance(int x1, int y1, int x2, int y2) {
        double a = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        return Math.sqrt(a);

    }
}
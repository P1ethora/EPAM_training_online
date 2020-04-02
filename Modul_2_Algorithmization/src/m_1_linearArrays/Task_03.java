package m_1_linearArrays;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов
 */

public class Task_03 {

    public static void main(String[] args) {
        double[] list = {9, 15, -25, 11, -5, 1, 63, 7, 18, -1, -767, 0};
        count(list);

    }

    private static void count(double[] list) {
        int zero = 0;
        int positive = 0;
        int negative = 0;

        for (double i : list) {
            if (i == 0) {
                zero++;
            } else if (i > 0) {
                positive++;
            } else if (i < 0)
                negative++;
        }

        System.out.print("Нули " + zero + "\n" + "Положительные " + positive + "\n" + "Отрицательные " + negative);
    }

}
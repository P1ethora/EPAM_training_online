package m_4_decomposition;

/**
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Task_08 {

    public static void main(String[] args) {
        int[] d = {1, 2, 3, 4, 5, 6};

        sum(d, 1, 3);
    }

    private static void sum(int[] d, int k, int m) {
        int a = k - 1, b = m - 1;
        if (a == 0 && b == 2 ||
            a == 2 && b == 4 ||
            a == 4 && b == 6) {
            int sum = b - a - 1;
            for (int i = a; i <= b - 2; i++) {
                sum = d[i] + d[i + 1] + d[i + 2];
            }
            System.out.println("Сумма от " + k + " до " + m + " = " + sum);
        } else {
            System.out.println("Некорректный ввод" + "\n" + "Доступные варианты: 1-3, 3-5, 4-6");
        }
    }
}
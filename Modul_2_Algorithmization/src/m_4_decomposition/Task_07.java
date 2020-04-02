package m_4_decomposition;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task_07 {

    public static void main(String[] args) {
        System.out.print("Сумма факториалов от 0 до 9 = " + sum());
    }

    private static int sum() {
        int value = 0;

        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                value += fact(i);
            }
        }
        return value;
    }

    private static int fact(int a) {
        int value = 1;

        for (int i = 1; i <= a; i++) {
            value *= i;
        }
        return value;
    }
}
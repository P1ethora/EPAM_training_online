package m_4_decomposition;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */

public class Task_14 {

    public static void main(String[] args) {

        int k = 1000000;

        for (int i = 1; i <= k; i++) {
            if (armstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static int count(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    private static boolean armstrongNumber(int number) {

        int count = count(number);
        int value = 0;
        int oldNumber = number;

        for (int i = 0; i < count; i++) {
            value += (int) (Math.pow((number % 10), count));
            number /= 10;
        }
        return value == oldNumber;
    }
}
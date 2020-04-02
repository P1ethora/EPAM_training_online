package m_4_decomposition;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился ноль? Для решения задачи использовать декомпозицию.
 */

public class Task_17 {

    public static void main(String[] args) {
        count(123);
    }

    private static void count(int a) {
        int count = 0;
        while (a != 0) {
            if (a > 0)
                a = a - sum(a);
            else
                a = a + sum(a);
            count++;
        }
        System.out.println(count);
    }

    private static int sum(int a) {
        int sum = 0;

        while (a > 0) {
            sum += (a % 10);
            a /= 10;
        }
        return sum;
    }
}
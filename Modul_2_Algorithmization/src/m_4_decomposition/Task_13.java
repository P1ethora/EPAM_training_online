package m_4_decomposition;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 */

public class Task_13 {

    public static void main(String[] args) {
        detect(50);

    }

    private static void detect(int n) {
        for (int i = n; i < 2 * n - 2; i++) {
            if (numbers(i) && numbers(i + 2)) {
                System.out.println(i + " и " + (i + 2));
            }
        }
    }

    private static boolean numbers(int m) {
        for (int i = 2; i < m / 2; i++) {
            if (m % i == 0) return false;
        }
        return true;
    }
}
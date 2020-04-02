package m_4_decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task_02 {

    public static void main(String[] args) {
        System.out.println(divisor(15, 25, 35, 45));
    }

    private static int divisor(int a, int b, int c, int d) {
        int min = min(min(a, b), min(c, d));
        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                return i;
            }
        }

        return 1;
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

}

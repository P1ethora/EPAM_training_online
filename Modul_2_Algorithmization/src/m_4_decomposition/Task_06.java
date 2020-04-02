package m_4_decomposition;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task_06 {

    public static void main(String[] args) {

        int x = 14,
            y = 25,
            z = 99;

        getSimple(x, y, z);

    }

    private static void getSimple(int x, int y, int z) {

        int div = 0;
        int min = Math.min(Math.min(x, y), z);

        for (int i = min; i > 0; i--) {
            if ((x % i == 0) && (y % i == 0) && (z % i == 0)) {
                div = i;
                break;
            }
        }

        if (div == 1) {
            System.out.println("Числа взаимно простые");
        } else {
            System.out.println("Числа не взаимно простые");
        }
    }
}
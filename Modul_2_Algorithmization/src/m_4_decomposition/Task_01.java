package m_4_decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел:
 * HOK(A,B) = (A*B)/ НОД(A,B)
 */

public class Task_01 {

    public static void main(String[] args) {
        System.out.println("Наибольший общий делитель = " + maxDivider(99, 9));

        System.out.println("Наименьшее общее кратное = " + minTime(48, 28));


    }

    private static int minTime(int a, int b) {
        int maxDivider = maxDivider(a, b);
        return a * b / maxDivider;
    }

    private static int maxDivider(int a, int b) {

        for (int i = (Math.min(a, b)); i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
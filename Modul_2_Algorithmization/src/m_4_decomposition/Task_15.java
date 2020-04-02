package m_4_decomposition;

/**
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
 */

public class Task_15 {

    public static void main(String[] args) {
        detect(2);

    }

    private static void detect(int n) {
        int[] numb = new int[n];
        numb[0] = 1;
        while (numb[n - 1] < 9) {
            for (int i = 1; i < numb.length; i++) {
                numb[i] = numb[0] + i;
            }
            for (int a : numb) {
                System.out.print(a);
            }
            System.out.print(" ");
            numb[0]++;
        }
        System.out.println();
    }
}
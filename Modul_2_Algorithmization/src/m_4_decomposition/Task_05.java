package m_4_decomposition;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task_05 {

    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8};
        beforeMax(mass);
    }

    private static int max(int[] mass) {
        int max = 0;
        for (int i : mass) {
            max = Math.max(max, i);
        }
        return max;
    }

    private static void beforeMax(int[] mass) {
        int max = max(mass);
        int beforeMax = 0;

        for (int i : mass) {
            // beforeMax = i>beforeMax && i<max? i : beforeMax;
            if (i > beforeMax && i < max) {
                beforeMax = i;
            }
        }
        System.out.println(beforeMax);
    }
}
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
        int[] number = new int[n];   //представление n-значного числа
        number[0] = 1;               //с начальной цифрой 1
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            for (int a : number) {
                System.out.print(a);
            }
            System.out.print(" ");
            number[0]++;
        }
    }
}
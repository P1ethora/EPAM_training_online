package m_1_linearArrays;

/**
 * Даны целые числа а₁,а₂ ,..., аₙ . Вывести на печать только те числа, для которых аᵢ > i.
 */

public class Task_05 {

    public static void main(String[] args) {
        int[] list = {10, 5, 1, 0, 20, 4, 3, 2, 15, 7};

        for (int i = 0; i < list.length; i++) {
            if (list[i] > i + 1)
                System.out.print(list[i] + " ");
        }
    }
}
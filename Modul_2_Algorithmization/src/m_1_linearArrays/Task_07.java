package m_1_linearArrays;

/**
 *  Даны действительные числа (a₁,a₂,...,aₙ).
 *  Найти max(a₁ | a₂ₙ, a₂ | a₂ₙ₋₁,...  aₙ | aₙ₊₁)
 */

public class Task_07 {

    public static void main(String[] args) {

        double[] list = {1.1, 2.2, 3, 4.4, 5.5, 6, 10.1};
        double max = list[0] + list[list.length - 1];
        double maxFinal = 0;
        for (int i = 1; i < list.length / 2; i++) {
            double sum = list[i] + list[list.length - 1 - i];
            maxFinal = Math.max(max, sum);
        }
        System.out.println(maxFinal);
    }
}
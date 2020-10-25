package m_1_linearArrays;

/**
 * Даны действительные числа (a₁,a₂,...,aₙ).
 * Найти max(a₁ | a₂ₙ, a₂ | a₂ₙ₋₁,...  aₙ | aₙ₊₁)
 * Найти max(a₁ | a₂ₙ, a₂ | a₂ₙ₋₁,...  aₙ | aₙ₊₁)
 */

public class Task_07 {

    public static void main(String[] args) {

        double[] list = {1.1, 2.2, 3, 4.4, 5.5, 6, 5};
        double max = list[0] + list[list.length - 1];
        for (int i = 1; i < list.length / 2; i++)          //можно сократить на 1 оборот
            max = Math.max(max, list[i] + list[list.length - i - 1]);
//        if (list.length % 2 == 0) {                      //можно добавить разве что проверочку на чет нечет массива
//            max = Math.max(max, list[list.length / 2]);   //если массив нечетный сравниваем центральный элемент с max
//        }
        System.out.println(max);
    }
}
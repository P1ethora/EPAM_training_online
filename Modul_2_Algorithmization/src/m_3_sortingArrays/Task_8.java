package m_3_sortingArrays;

/**
 * Даны дроби p1/q1, p2/q2,.., pn/qn(pi,qi - натуральные). Составить программу, которая приводит
 * эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task_8 {

    public static void main(String[] args) {

        int pn = 5;
        int element;

        int[] numerator = new int[pn];
        int[] denominator = new int[pn];

        for (int i = 0; i < pn; i++) {
            numerator[i] = 1 + (int) (Math.random() * 10);
            denominator[i] = 1 + (int) (Math.random() * 10);
            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
        element = nok(denominator[0], denominator[1]);
        if (pn > 2) {
            for (int i = 2; i < pn; i++) {
                element = nok(element, denominator[i]);
            }
        }

        for (int i = 0; i < pn; i++) {
            numerator[i] = element / denominator[i] * numerator[i];
            denominator[i] = element;
        }

        for (int i = 0; i < pn; i++) {
            for (int j = 0; j < pn - 1; j++) {
                if (numerator[j] > numerator[j + 1]) {
                    int value = numerator[j];
                    numerator[j] = numerator[j + 1];
                    numerator[j + 1] = value;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < pn; i++) {

            System.out.print(numerator[i] + "/" + denominator[i] + " ");
        }
    }

    private static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    private static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }
}
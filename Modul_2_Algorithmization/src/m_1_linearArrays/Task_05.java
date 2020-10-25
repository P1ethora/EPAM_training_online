package m_1_linearArrays;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Даны целые числа а₁,а₂ ,..., аₙ . Вывести на печать только те числа, для которых аᵢ > i.
 */

public class Task_05 {

    public static void main(String[] args) {
        int[] list = {10, 5, 1, 0, 20, 4, 3, 2, 15, 7};

        IntStream.range(0, list.length)
                .filter(i -> list[i] > i + 1)
                .mapToObj(i -> list[i] + " ")
                .forEach(System.out::print);

    }
}
package com.company.сycles;

/**
 * Найти сумму квадратов первых ста чисел.
 */


public class Task_3 {

    public static void main(String[] args) {

        int n = 150, sum = 0, i = 0;

        while (i <= n) {

            i++;
            sum += Math.pow(i, 2);

            if (i == 100) {
                break;
            }
        }

        System.out.println(sum);

    }
}



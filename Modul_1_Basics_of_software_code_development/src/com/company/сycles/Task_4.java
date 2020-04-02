package com.company.сycles;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task_4 {

    public static void main(String[] args) {

        int n = 250, sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += Math.pow(i, 2);

            if (i == 200) {
                break;
            }
        }

        System.out.println(sum);

    }
}







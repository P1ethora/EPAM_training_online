package com.company.branching;

/**
 * Найти max{min(a, b), min(c, d)}.
 */

public class Task_2 {

    public static void main(String[] args) {
        int a = 300, b = 89, c = 300, d = 299;

        System.out.println(max(min(a, b), min(c, d)));
    }

    private static int min(int a, int b) {
        return a < b ? a : b;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}

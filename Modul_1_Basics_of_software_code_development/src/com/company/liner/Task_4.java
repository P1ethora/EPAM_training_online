package com.company.liner;

import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task_4 {

    public static void main(String[] args) {

        System.out.printf("%.3f", valueSum(new Scanner(System.in).nextDouble()));

    }

    private static double valueSum(double r) {
        int x = (int) r;
        double res1 = (double) (int) x / 1000;
        double int1 = (r % 1) * 1000;
        return int1 + res1;
    }
}
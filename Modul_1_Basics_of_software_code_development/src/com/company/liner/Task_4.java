package com.company.liner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task_4 {

    public static void main(String[] args) {

        double r = 1234.3214;

        int x = (int) r;
        double res = (int) x;
        double res1 = res / 1000;
        double int1 = (r % 1) * 1000;
        double sum = int1 + res1;

        System.out.printf("%.3f", sum);
    }
}
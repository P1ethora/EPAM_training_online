package com.company.liner;

import java.util.Scanner;

public class Task_3 {

    /**
     * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
     * z = ((sin x + cos y) / (cos x - sin y)) * tg xy
     */

    public static void main(String[] args) {
        double z;
        z = valueZ(new Scanner(System.in).nextDouble(), new Scanner(System.in).nextDouble());

        System.out.printf("%.2f", z);

    }

    private static double valueZ(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}

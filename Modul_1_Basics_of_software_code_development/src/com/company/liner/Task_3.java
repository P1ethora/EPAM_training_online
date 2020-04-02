package com.company.liner;

public class Task_3 {

    /**
     * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
     * z = ((sin x + cos y) / (cos x - sin y)) * tg xy
     */

    public static void main(String[] args) {
        double z, x = 6, y = 6, t = 6, g = 6;

        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * t * g * x * y;

        System.out.printf("%.2f", z);

    }
}

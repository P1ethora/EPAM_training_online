package com.company.liner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * z=(b+√(b²+4ac))/2a - a³с + b⁻ ²
 */

public class Task_2 {

    public static void main(String[] args) {

        double z, a = 6, b = 6, c = 6;

        z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

        System.out.printf("%.2f", z);
    }
}

package com.company.liner;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения)
 * z=(b+√(b²+4ac))/2a - a³с + b⁻ ²
 */

public class Task_2 {

    public static void main(String[] args) {

        double z;

        z = valueZ(new Scanner(System.in).nextDouble(),new Scanner(System.in).nextDouble(),new Scanner(System.in).nextDouble());

        System.out.printf("%.2f", z);
    }

    private static double valueZ(double a, double b, double c){
        return  (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
    }
}

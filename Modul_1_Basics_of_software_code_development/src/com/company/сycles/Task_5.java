package com.company.сycles;

public class Task_5 {

    /**
     * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
     * заданному е. Общий член ряда имеет вид:
     * aₙ = 1/2ₙ + 1/3ₙ
     */

    public static void main(String[] args) {

        double e = 0.001;
        double sum = 0;

        for (int n = 1; ; ++n) {

            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));

            if (Math.abs(a) <= e)

                break;

            sum += a;
        }

        System.out.print(sum);

    }
}
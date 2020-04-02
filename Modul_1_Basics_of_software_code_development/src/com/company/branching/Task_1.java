package com.company.branching;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */

public class Task_1 {

    public static void main(String[] args) {

        int a = 20;
        int b = 100;

        if (180 - a - b != 0 && a != 0 && b != 0) {

            System.out.print("Треугольник существует ");

        } else {

            System.out.print("Треугольник не существует");
        }

        if (180 - a - b != 0 && 180 - a - b == 90 || 180 - a - b != 0 && a == 90 || 180 - a - b != 0 && b == 90) {

            System.out.print("и является прямоугольным.");

        }
    }
}


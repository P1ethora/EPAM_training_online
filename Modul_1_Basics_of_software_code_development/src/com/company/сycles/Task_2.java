package com.company.сycles;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y=x,x>2  y=-x,x>=2
 */

public class Task_2 {

    public static void main(String[] args) {


        double a = 1;
        double b = 14;

        double h = 0.5;

        double y;

        for (double x = a; x <= b; x += h) {

            if (x <= 2) {

                y = -x;
                System.out.println("y = " + y);

            } else {

                y = x;
                System.out.println("y = " + y);

            }
        }
    }
}

package com.company.branching;

public class Task_4 {

    /**
     *  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить,
     *  пройдет ли кирпич через отверстие.
     */

    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        int x = 5;
        int y = 5;
        int z = 5;

        if     ((x <= a) && (y <= b) ||
                (y <= a) && (x <= b) ||
                (x <= a) && (z <= b) ||
                (z <= a) && (x <= b) ||
                (z <= a) && (y <= b) ||
                (y <= a) && (z <= b))  {

            System.out.print("Кирпич пройдет в отверстие");

        } else {

            System.out.print("Кирпич не пройдет в отверстие");

        }

    }

}

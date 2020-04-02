package com.company.branching;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task_3 {
    public static void main(String[] args) {

        int x1 = 198;
        int y1 = 199;

        int x2 = 198;
        int y2 = 199;

        int x3 = 198;
        int y3 = 199;

        if (((x1 - x3) * (y2 - y3)) == ((x2 - x3) * (y1 - y3))) {

            System.out.print("Точки лежат на одной прямой");

        } else {

            System.out.print("Точки не лежат наодной прямой");

        }
    }
}

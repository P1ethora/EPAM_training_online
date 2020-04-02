package com.company.branching;

/**
 * Вычислить значение функции:
 *F(x) = x2 = x²-3x+9, если x<=3
 *F(x) = 1/(x³ + 6), если x>3
 */

public class Task_5 {

    public static void main(String[] args) {

    double x=2;
    double f;

    if(x<=3) {

        f= Math.pow(x,2)-3*x+9;

        System.out.print(f);

    } else if(x>3) {

        f=1/(Math.pow(x,3)+6);

        System.out.printf("%.3f",f);
    }

    }

}

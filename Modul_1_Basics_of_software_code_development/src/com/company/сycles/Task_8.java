package com.company.сycles;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task_8 {

    public static void main(String[] args) {

        int a = 14567;
        int b = 14959343;

        share(a);
        share(b);

    }

    private static void share(int numb) {

        System.out.print(numb + " = ");

        while (numb != 0) {
            int digit = numb % 10;
            numb /= 10;
            System.out.print(digit + " ");
        }

        System.out.println(" ");
    }
}
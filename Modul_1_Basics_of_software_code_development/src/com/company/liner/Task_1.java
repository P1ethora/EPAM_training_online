package com.company.liner;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
 */

public class Task_1 {

    public static void main(String[] args) {

        System.out.print(valueZ(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()));

    }

    private static int valueZ(int a, int b, int c) {

        return ((a - 3) * b / 2) + c;
    }
}

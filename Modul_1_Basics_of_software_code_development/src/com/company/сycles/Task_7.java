package com.company.сycles;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Task_7 {

    public static void main(String[] args) {

        System.out.print("Начало промежутка: ");
        int m = input();
        System.out.print("Конец промежутка: ");
        int n = input();
        System.out.println("\n" + "Согласно условию");
        for (int k = m; n >= k; k++) {
            System.out.print("Делители числа " + k + " это ");
            divider(k);
            System.out.println("");
        }

    }

    public static int input() {
        return new Scanner(System.in).nextInt();
    }

    public static void divider(int oneNumb) {

        for (int i = 1; oneNumb >= i; i++) {

            if (i == 1 || i == oneNumb) {
                continue;
            } else if (oneNumb % i == 0) {
                System.out.print(i + " ");
            } else {
                continue;
            }

        }
    }
}
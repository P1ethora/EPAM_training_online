package com.company.сycles;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */

public class Task_1 {
    public static void main(String[] args) {

        System.out.print("Введите число: ");
        int numb = new Scanner(System.in).nextInt();
        if (numb < 1) {
            System.out.print("Неверный формат числа");
        } else {
            int sum = 0;
            for (int i = 1; numb >= i; i++)
                sum += i;

            System.out.println(sum);
        }
    }
}
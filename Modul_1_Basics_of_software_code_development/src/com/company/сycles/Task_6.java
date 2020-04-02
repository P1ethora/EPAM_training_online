package com.company.сycles;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task_6 {

    public static void main(String[] args) {

        int x = 10000;

        for (int i = 0; x >= i; i++) {

            char c = (char) i;

            System.out.println(i + " соответствует символу " + c);

        }
    }
}
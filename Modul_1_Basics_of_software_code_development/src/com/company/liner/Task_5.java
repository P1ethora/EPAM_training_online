package com.company.liner;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class Task_5 {
    public static void main(String[] args) {

        int secNumb = new Scanner(System.in).nextInt();
        System.out.println(valueHour(secNumb) + "ч " + valueMin(secNumb) + "мин " + valueSecOut(secNumb) + "с");

    }

    private static int valueHour(int secNumb) {
        return secNumb / 3600;
    }

    private static int valueMin(int secNumb) {
        return (secNumb % 3600) / 60;
    }

    private static int valueSecOut(int secNumb) {
        return (secNumb % 3600) % 60;
    }

}
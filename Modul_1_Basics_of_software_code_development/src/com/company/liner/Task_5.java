package com.company.liner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

public class Task_5 {
    public static void main(String[] args) {

        int secNumb = 5600;

        int hour = secNumb / 3600;
        int min = (secNumb % 3600) / 60;
        int sec_out = (secNumb % 3600) % 60;

        System.out.println(hour + "ч " + min + "мин " + sec_out + "с");

    }
}
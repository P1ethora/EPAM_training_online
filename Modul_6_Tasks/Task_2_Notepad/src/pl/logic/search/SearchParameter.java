package pl.logic.search;

import pl.content.Note;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchParameter {

    public ArrayList<Note> searchP() {
        System.out.print("1-Дата/2-Тема/3-Почта/4-Сообщение/5-Закрыть\n Введите ваш параметр: ");
        int number = new Scanner(System.in).nextInt();
        ArrayList<Note> notes;

        if (number == 1) {
            System.out.println("Формат даты уууу-mm-dd");
            return new SearchRegx("date").getBase();
        } else if (number == 2) notes = new SearchRegx("subject").getBase();
        else if (number == 3) notes = new SearchRegx("email").getBase();
        else if (number == 4) notes = new SearchRegx("message").getBase();
        else if (number == 5) return null;
        else {
            System.out.println("Некорректны ввод");
            return null;
        }
        if (notes.size() == 0) {
            System.out.println("Не найдено");
            return null;
        }
        return notes;
    }
}
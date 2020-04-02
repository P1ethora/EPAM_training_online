package pl.client;

import pl.content.Note;
import pl.content.NoteBase;
import pl.logic.CreateNote;
import pl.logic.search.SearchGroup;
import pl.logic.search.SearchParameter;

import java.util.*;


public class Client {

    public Client() throws Exception {

        System.out.println("Количество записей в блокноте: " + NoteBase.notes.size());

        while (true) {
            System.out.println("1-Показать записи/ 2-Найти запись по параметру/" +
                    " 3-Поиск по группе параметров/ 4-Добавить запись/ 5-Завершить ");
            System.out.print("Ваш выбор: ");
            int number = new Scanner(System.in).nextInt();

            if (number == 1) {
                for (Note note : NoteBase.notes) {
                    System.out.println(note + "\n");
                }
            }
            if (number == 2) {
                for (Note note : new SearchParameter().searchP())
                    System.out.println(note + "\n");

            } else if (number == 3) {
                for (Note note : new SearchGroup().searchG())
                    System.out.println(note + "\n");

            } else if (number == 4) {
                NoteBase.notes.add(new CreateNote().create());

            } else if (number == 5) break;
            else {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
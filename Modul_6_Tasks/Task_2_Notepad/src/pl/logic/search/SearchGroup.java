package pl.logic.search;

import pl.content.Note;

import java.util.*;
import java.util.regex.Pattern;

public class SearchGroup {

    public ArrayList<Note> searchG() {

        Collection<String> param = new HashSet<>();
        int check;
        while (true) {
            System.out.print("1-Дата/2-Тема/3-Почта/4-Сообщение/5-Закончить выбор/6-Закрыть\nВведите ваш параметр: ");
            int number = new Scanner(System.in).nextInt();
            check = param.size();
            if (number == 1) {
                param.add("date");
            } else if (number == 2) {
                param.add("subject");
            } else if (number == 3) {
                param.add("email");
            } else if (number == 4) {
                param.add("message");
            } else if (number == 5) {
                return startSearchG(param);
            } else if (number == 6) {
                return null;
            } else {
                System.out.println("Некорректный ввод");
            }
            if (check == param.size()) System.out.println("!!!Параметр уже добавлен");
            else
                System.out.println("Количество параметров " + param.size());
        }
    }

    private ArrayList<Note> startSearchG(Collection<String> parameters) {

        ArrayList<Note> notes = new ArrayList<>();
        System.out.print("Поиск: ");
        String searchParam = new Scanner(System.in).nextLine();
        for (String parameter : parameters) {
            notes.addAll(new SearchRegx(parameter, Pattern.compile((searchParam))).getBase());
        }

        if (notes.size() == 0) {
            System.out.println("Не найдено");
        } else
            Collections.sort(notes, Comparator.comparing(Note::getCreationDate));
        return notes;
    }

}
package pl.logic.search;

import pl.content.Note;
import pl.content.NoteBase;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchRegx {

    private ArrayList<Note> base = new ArrayList<>();

    public SearchRegx(String parameter) {
        System.out.print("Поиск: ");
        Pattern pt = Pattern.compile((new Scanner(System.in).nextLine()));
        search(parameter, pt);
    }

    public SearchRegx(String parameter, Pattern pattern) {
        search(parameter, pattern);
    }

    private void search(String parameter, Pattern pattern) {

        for (Note note : NoteBase.notes) {
            Matcher mt = null;
            if (parameter.equals("date")) {
                mt = pattern.matcher(note.getCreationDate().toString());
            } else if (parameter.equals("subject")) {
                mt = pattern.matcher(note.getSubject());
            } else if (parameter.equals("email")) {
                mt = pattern.matcher(note.getEmail());
            } else if (parameter.equals("message")) {
                mt = pattern.matcher(note.getMessage());
            }
            if (mt.find()) {
                base.add(note);

            }
        }//for
    }

    public ArrayList<Note> getBase() {
        return base;
    }
}
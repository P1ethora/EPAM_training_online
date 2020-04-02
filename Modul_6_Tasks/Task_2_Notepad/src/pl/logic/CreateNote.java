package pl.logic;

import pl.content.Note;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateNote {

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                    "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private Pattern pattern;
    private Matcher matcher;

    public Note create() throws Exception {
        pattern = Pattern.compile(EMAIL_PATTERN);


        System.out.print("Введите тему: ");
        String subject = new Scanner(System.in).nextLine();

        System.out.print("Введите email: ");
        String email = new Scanner(System.in).nextLine();
        if (!validateEmail(email)) throw new Exception("Некорректный email");

        System.out.print("Введите сообщение: ");
        String message = new Scanner(System.in).nextLine();

        return new Note(subject, LocalDate.now(), email, message);
    }

    private boolean validateEmail(final String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
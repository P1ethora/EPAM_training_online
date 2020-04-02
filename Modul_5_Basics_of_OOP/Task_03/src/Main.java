import java.time.LocalDate;

/**
 * Создать класс календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходых и праздничных днях.
 */

public class Main {

    public static void main(String[] args) {

        Calendar calendar = new Calendar();

        LocalDate date = LocalDate.of(2020, 5, 10);
        LocalDate date1 = LocalDate.of(2020, 6, 15);
        LocalDate date2 = LocalDate.of(2020, 7, 1);
        LocalDate date3 = LocalDate.of(2020, 8, 25);

        Calendar.Note note  = calendar.new Note(date , "Выходной");
        Calendar.Note note1 = calendar.new Note(date1, "Праздник");
        Calendar.Note note2 = calendar.new Note(date2, "Выходной");
        Calendar.Note note3 = calendar.new Note(date3, "Праздник");
        calendar.addDay(note, note1,note2,note3);

        calendar.printCalendar();
    }
}

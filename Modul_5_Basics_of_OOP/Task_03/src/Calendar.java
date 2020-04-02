import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Calendar {

    private ArrayList<Note> notes = new ArrayList<>();

    public void addDay(Note... notes) {

        Collections.addAll(this.notes, notes);
    }

    public void printCalendar() {
        for (Note note : notes) {
            System.out.println(note);
        }
    }

    class Note {

        private LocalDate date;
        private String event;

        Note(LocalDate date, String event) {
            this.date = date;
            this.event = event;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String toString() {
            return date.toString() + "; " + event;
        }
    }

}
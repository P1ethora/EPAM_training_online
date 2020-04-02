package pl.content;

import java.time.LocalDate;

public class Note {

    private String subject;
    private LocalDate creationDate;
    private String email;
    private String message;

    public Note(String subject, LocalDate creationDate, String email, String message) {
        this.subject = subject;
        this.creationDate = creationDate;
        this.email = email;
        this.message = message;
    }

    public Note() {
    }

    public String toString() {

        return "Дата создания: " + creationDate + "\n" +
                "Тема: " + subject + "\n" +
                "Почта: " + email + "\n" +
                "Сообщение: " + message;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

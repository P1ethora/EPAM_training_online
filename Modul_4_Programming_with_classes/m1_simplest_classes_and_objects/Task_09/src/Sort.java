import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort {

    private Book[] array;
    private boolean check = false;

    public Sort(Book[] array) {
        this.array = array;
    }

    public void searchAuthor() {
        System.out.print("Введите фамилию: ");
        String name = new Scanner(System.in).nextLine();
        for (Book book : array) {
            if (book.getAuthor().equals(name)) {
                System.out.println(book);
                check = true;
            }
        }
        check(check);
    }

    public void searchPublisher() {
        System.out.print("Введите название: ");
        String name = new Scanner(System.in).nextLine();
        for (Book book : array) {
            if (book.getPublisher().equals(name)) {
                System.out.println(book);
                check = true;
            }
        }
        check(check);
    }

    public void searchData() {
        System.out.print("Введите год: ");
        int year = new Scanner(System.in).nextInt();

        Arrays.sort(array, Comparator.comparing(Book::getYearOfPublication));
        for (Book book : array) {
            if (book.getYearOfPublication() > year) {
                System.out.println(book);
                check = true;
            }

        }
        check(check);
    }

    private void check(boolean check) {
        if (!check) {
            System.out.println("Не найдено");
        }
        this.check = false;
    }
}
package pl.client.view;

import pl.client.logicClient.workingWithMail.Sending;
import pl.content.forCatalog.BaseBooks;
import pl.content.forCatalog.Book;
import pl.client.logicClient.paginatedViewing.PaginatedViewing;

import java.util.Scanner;

public class UserView implements View {

    private boolean stop;

    public UserView(String login) throws Exception {
        while (true) {
            if (stop) break;
            System.out.println("1-просмотр/2-поиск книги/3-предложить книгу/4-завершить");
            System.out.print("Введите команду: ");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    PaginatedViewing paginatedViewing = new PaginatedViewing();
                    break;
                case 2:
                    System.out.print("Введите имя книги: ");
                    String name = new Scanner(System.in).nextLine();
                    boolean check = false;
                    for (Book book : BaseBooks.baseBooks) {
                        if (book.getName().equals(name)) {
                            System.out.println(book);
                            check = true;
                        }
                    }
                    if (!check) {
                        System.out.println("Книга отсутствует");
                    }
                    check = false;
                    break;

                case 3:
                    System.out.print("Введите имя книги: ");
                    String nameBook = new Scanner(System.in).nextLine();
                    String massage = "Пользователь \"" + login + "\" Предлагает добавить книгу \"" + nameBook + "\"";
                    new Sending("Книга для библиотеки", massage, "admin"); break;
                case 4:
                    stop = true;
                    break;
                default:
                    System.out.println("Некорректный ввод");

            }
        }
        stop = false;
    }
}
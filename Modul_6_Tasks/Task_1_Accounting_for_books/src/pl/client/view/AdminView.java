package pl.client.view;

import pl.client.logicClient.Editor.CatalogEditor;
import pl.client.logicClient.paginatedViewing.PaginatedViewing;
import pl.client.logicClient.workingWithMail.Sending;
import pl.content.forCatalog.BaseBooks;
import pl.content.forCatalog.Book;
import pl.content.forCatalog.logicBook.AddBook;

import java.io.IOException;
import java.util.Scanner;

public class AdminView implements View {

    private boolean stop;

    public AdminView() throws Exception {

        while (true) {
            stop = false;
            if (stop) break;
            System.out.println("1-просмотр/2-поиск книги/3-Редактировать/4-Добавить книгу/5-Завершить");
            System.out.print("Введите команду: ");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    new PaginatedViewing();
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
                    CatalogEditor catalogEditor = new CatalogEditor();
                    if (catalogEditor.getNumber() == 1) {
                        new Sending("Описание для книги", "Добавлено описание для книги \"" + catalogEditor.getNameBook() + "\"", "user");
                    } break;
                case 4:
                    new AddBook();
                    break;
                case 5:
                    stop = true;
                    break;
                default:
                    System.out.println("Некорректный ввод");

            }
        }
        stop = false;
    }
}
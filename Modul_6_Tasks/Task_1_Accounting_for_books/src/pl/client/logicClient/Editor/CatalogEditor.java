package pl.client.logicClient.Editor;

import pl.content.forCatalog.BaseBooks;

import java.io.IOException;
import java.util.Scanner;

public class CatalogEditor extends WriteFile {

    private int number;
    private String nameBook;

    public CatalogEditor() throws IOException {

        System.out.println("Введите имя книги: ");
        nameBook = new Scanner(System.in).nextLine();
        for (int i = 0; i < BaseBooks.baseBooks.size(); i++) {
            if (BaseBooks.baseBooks.get(i).getName().equals(nameBook)) {
                while (true) {
                    System.out.println("1-Добавить описание/2-Удалить/3-Закрыть");
                    number = new Scanner(System.in).nextInt();
                    if (number == 1) {
                        System.out.println("Введите описание книги:");
                        BaseBooks.baseBooks.get(i).setDescription(new Scanner(System.in).nextLine() + "\n");
                        break;
                    } else if (number == 2) {
                        BaseBooks.baseBooks.remove(i);break;
                    } else if (number == 3) {
                        break;
                    } else {
                        System.out.println("Некорректный ввод");
                        break;
                    }

                }
            }
        }
        write();
    }

    public int getNumber() {
        return number;
    }

    public String getNameBook() {
        return nameBook;
    }
}
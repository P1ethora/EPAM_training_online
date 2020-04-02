package pl.content.forCatalog.logicBook;

import pl.content.FileReference;
import pl.content.forCatalog.Book;
import pl.content.forCatalog.BaseBooks;

import java.io.*;
import java.util.Scanner;

public class AddBook {

    public AddBook() throws Exception {
        Book book;

        System.out.print("Введите имя книги: ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Введите автора книги: ");
        String author = new Scanner(System.in).nextLine();
        System.out.print("Введите тип книги: ");
        String bookType = new Scanner(System.in).nextLine();
        System.out.print("Укажите описание книги: ");
        String description = new Scanner(System.in).nextLine();
        String appendText;

            book = new Book(name, author,bookType, description);
            appendText = name + System.lineSeparator() + author + System.lineSeparator() + bookType +System.lineSeparator() + description + System.lineSeparator() + "?" + System.lineSeparator();
            System.out.println(appendText);

        appendUsingFileWriter(appendText);

        BaseBooks.baseBooks.add(book);

    }

    private void appendUsingFileWriter(String data) throws Exception {
        FileWriter writer = new FileWriter(FileReference.fileCatalogBooks, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(data);
        bufferWriter.close();

    }

}
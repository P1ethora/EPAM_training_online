package pl.content.forCatalog.logicCatalog;

import pl.content.FileReference;
import pl.content.forCatalog.BaseBooks;
import pl.content.forCatalog.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadCatalogBooks {

    private Book book;

    private String name;
    private String author;
    private String typeBook;
    private String description = "";

    public ReadCatalogBooks() throws IOException {

        File file = new File(FileReference.fileCatalogBooks);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        while (line != null) {
            name = line;
            author = reader.readLine();
            typeBook = reader.readLine();

            line = reader.readLine();
            while (line != null) {
                description += line + "\n";
                line = reader.readLine();
                if (line.equals("?")) break;
            }

            if (!description.equals(""))
                book = new Book(name, author,typeBook, description);
            else
                book = new Book(name, author,typeBook);

            BaseBooks.baseBooks.add(book);
            description = "";
            line = reader.readLine();
        }
    }
}
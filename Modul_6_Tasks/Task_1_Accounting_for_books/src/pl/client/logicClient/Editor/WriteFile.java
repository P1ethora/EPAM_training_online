package pl.client.logicClient.Editor;

import pl.content.FileReference;
import pl.content.forCatalog.BaseBooks;
import pl.content.forCatalog.Book;

import java.io.FileWriter;
import java.io.IOException;


class WriteFile {

    void write() throws IOException {
        FileWriter writer = new FileWriter(FileReference.fileCatalogBooks);
        for (Book book : BaseBooks.baseBooks) {
            writer.write(book.toString() + "?" + "\n");

        }
        writer.flush();
        writer.close();

    }
}
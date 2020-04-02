package pl.launch;

import pl.client.Client;
import pl.content.forCatalog.BaseBooks;
import pl.content.forCatalog.logicCatalog.ReadCatalogBooks;
import pl.content.forAccount.logicAccount.ReadAccounts;

public class Main {

    public static void main(String[] args) throws Exception {

        ReadAccounts readAccounts = new ReadAccounts();
        readAccounts.readAccounts();

        ReadCatalogBooks readCatalogBooks = new ReadCatalogBooks();
        System.out.println("Количество книг в библиотеке " + BaseBooks.baseBooks.size());

        Client client = new Client();

    }
}
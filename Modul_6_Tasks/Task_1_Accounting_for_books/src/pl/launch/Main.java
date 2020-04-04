package pl.launch;

import pl.client.Client;
import pl.content.forCatalog.BaseBooks;
import pl.content.forCatalog.logicCatalog.ReadCatalogBooks;
import pl.content.forAccount.logicAccount.ReadAccounts;

/**
 * Система учитывает книги как в электронном, так и в бумажном варианте.
 * Существующие роли: пользователь, администратор.
 * Пользователь может просматривать книги в каталоге книг, осуществлять поиск
 * книг в каталоге.
 * Администратор может модифицировать каталог.
 * При добавлении описания книги в каталог оповещение о ней рассылается на
 * е-таil всем пользователям
 * При просмотре каталога желательно реализовать постраничный просмотр
 * Пользователь может предложить добавить книгу в библиотеку, переслав её
 * администратору на е-mail.
 * Каталог книг хранится в текстовом файле.
 * Данные аутентификации пользователей хранятся в текстовом файле. Пароль
 * не хранится в открытом виде
 */

public class Main {

    public static void main(String[] args) throws Exception {

        ReadAccounts readAccounts = new ReadAccounts();
        readAccounts.readAccounts();

        ReadCatalogBooks readCatalogBooks = new ReadCatalogBooks();
        System.out.println("Количество книг в библиотеке " + BaseBooks.baseBooks.size());

        Client client = new Client();

    }
}
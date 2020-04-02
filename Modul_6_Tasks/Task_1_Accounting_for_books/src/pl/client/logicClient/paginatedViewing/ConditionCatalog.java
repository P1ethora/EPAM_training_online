package pl.client.logicClient.paginatedViewing;

import pl.content.forCatalog.BaseBooks;

public class ConditionCatalog {

    private int numberPage;
    private int startNumber;
    private int numberBooks;

    public ConditionCatalog(int numberPage, int startNumber, int numberBooks) {
        this.numberPage = numberPage;
        this.startNumber = startNumber;
        this.numberBooks = numberBooks;
    }

    public void print() {
        for (int i = startNumber; i < startNumber + numberBooks; i++)
            System.out.println(BaseBooks.baseBooks.get(i));
    }

    public int getNumberPage() {
        return numberPage;
    }

    public String toString() {
        return "Номер " + numberPage + "/ Начало - " + startNumber + "/ Количество книг - " + numberBooks;
    }

}
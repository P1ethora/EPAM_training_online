package pl.client.logicClient.paginatedViewing;

import pl.content.forCatalog.BaseBooks;
import java.util.ArrayList;
import java.util.Scanner;

public class PaginatedViewing {

    private static int counter = 0;

    public PaginatedViewing() throws Exception {

        ArrayList<ConditionCatalog> condition = new ArrayList<>();

        System.out.println("Сколько показывать книг на странице: ");
        int n = new Scanner(System.in).nextInt();
        if (n < 1 || n > BaseBooks.baseBooks.size())
            throw new Exception("число должно быть больше нуля и меньше количества книг в библиотеке");

        int count = 0;
        int noww = 0;

        while (noww < BaseBooks.baseBooks.size()) {
            for (int z = noww; z < BaseBooks.baseBooks.size(); z++) {
                count++;

                if (count == n)
                    break;
            }
            condition.add(new ConditionCatalog(counter += 1, noww, count));
            noww += count;
            count = 0;
            System.out.println("Сейчас - " + noww);
        }
        System.out.println(condition.size());
        condition.forEach(System.out::println);
        int numberPage = 0;
        int number = 0;
        while (true) {
            System.out.println("СТРАНИЦА " + (numberPage + 1));
            condition.get(numberPage).print();
            if (condition.get(numberPage).getNumberPage() == 1) {
                System.out.println("2- Следующая / 3-Закончить");
            } else if (condition.get(numberPage).getNumberPage() == condition.size()) {
                System.out.println("1- Предыдущая / 3-Закончить");
            } else {
                System.out.println("1- Предыдущая / 2- Следующая / 3-Закончить");
            }
            number = new Scanner(System.in).nextInt();
            if (number == 1 && numberPage + 1 > 1) {
                numberPage -= 1;
            } else if (number == 2 && numberPage + 1 < condition.size()) {
                numberPage += 1;
            } else if (number == 3) break;
            else {
                System.out.println("Неверный ввод");
                break;
            }

        }
        counter = 0;
    }
}
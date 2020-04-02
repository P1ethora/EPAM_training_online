import java.util.Scanner;

public class AggregateBook {

    public AggregateBook() {

        Book[] books = {new Book("Война и мир", "Толстой", "НоваТел", 2018, 1274, 20, "Твердый"),
                new Book("Капитанская дочка", "Пушкин", "ТипоГраф", 2012, 130, 11, "Твердый"),
                new Book("Белая гвардия", "Булгаков", "Мультипринт", 2015, 300, 15, "Мягкий"),
                new Book("Мертвые души", "Гоголь", "Графман", 2014, 410, 17, "Твердый"),
                new Book("Дикая охота короля Стаха", "Короткевич", "ТипоГраф", 2016, 147, 10, "Мягкий")};

        System.out.println("1-книги автора/2-книги издания/3-книги после заданного года/4-выход");

        Sort sort = new Sort(books);

        while (true) {
            int i = 0;
            System.out.print("Ваш выбор: ");
            switch (new Scanner(System.in).nextInt()) {

                case 1:
                    sort.searchAuthor();
                    break;
                case 2:
                    sort.searchPublisher();
                    break;
                case 3:
                    sort.searchData();
                    break;
                case 4:
                    i = 1;
                    break;
                default:
                    System.out.println("Неверная команда");
            }
            if (i == 1) break;
        }
    }
}
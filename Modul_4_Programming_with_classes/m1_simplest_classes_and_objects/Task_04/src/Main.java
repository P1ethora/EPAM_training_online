import java.util.Scanner;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с
 * одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Main {

    public static void main(String[] args) {

        Train[] trains = {new Train("Minsk", 1, "11:00"),
                new Train("Grodno", 29, "16:00"),
                new Train("Vitebsk", 3, "13:00"),
                new Train("Grodno", 16, "14:00"),
                new Train("Brest", 4, "15:00")};
        Sort sort = new Sort(trains);
        System.out.println("1 - сортировка по номерам, 2 - по пункту назначения, 3 - вывод информации по номеру" +
                ", 4 - выход ");

        while (true) {
            System.out.print("Ваш выбор: ");
            int toggle = new Scanner(System.in).nextInt();

            if (toggle == 1)
                sort.sortNumber();
            else if (toggle == 2) {
                sort.sortDestination();
            } else if (toggle == 3) {
                Print print = new Print(trains);
            } else if (toggle == 4) {
                break;
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
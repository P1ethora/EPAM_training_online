import java.util.Scanner;

public class Client {

    private Trip trip;

    public Client() {

        Suggestion suggestion = new Suggestion();

        System.out.println("Меню/ 1 - Готовые путевки/2 - Сортировка по цене/3 - Выбор путевки/4 - Выход");

        int toggle = 0;
        while (true) {
            System.out.print("Меню/Ваш выбор: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    suggestion.printTrips();
                    break;
                case 2:
                    suggestion.sort();
                    break;
                case 3:
                    trip = suggestion.selection();
                    break;
                case 4:
                    toggle = 1;
                    break;

            }
            if (choice > 4 || choice < 1)
                System.out.println("Некорректный ввод");
            if (toggle == 1) {
                break;
            }
        }
        toggle = 0;
    }

    public Trip getTrip() {
        return trip;
    }
}
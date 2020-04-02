import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class Suggestion {

    private ArrayList<Trip> trips = new ArrayList<>();

    public Suggestion() {

        trips.add(new Trip("Отдых", "Автобус", true, 10));
        trips.add(new Trip("Экскурсия", "Автобус", false, 2));
        trips.add(new Trip("Лечение", "Поезд", true, 20));
        trips.add(new Trip("Шоппинг", "Микроавтобус", false, 1));
        trips.add(new Trip("Круиз", "Самолет", true, 7));

    }

    public void printTrips() {
        int count = 0;
        for (Trip trip : trips) {
            count++;
            System.out.println(count + ") " + trip);
        }
        count = 0;
    }

    public Trip selection() {
        System.out.println("Готовые варианты: ");
        printTrips();
        System.out.print("Выберите номер путевки: ");
        int number = new Scanner(System.in).nextInt();
        if (number > trips.size() || number < 1) {
            System.out.println("Некорректный ввод");
        } else {
            System.out.println("Для подтверждения покупки введите - 1; Изменение параметров - 2; Отмена - 3");
            System.out.print("3/Выбор: ");
            int choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                System.out.println("Вы приобрели:\n" + trips.get(number - 1));
                return trips.get(number - 1);
            } else if (choice == 2) {
                Trip trip = editor(trips.get(number - 1));
                if (trip != null) {
                    System.out.println("Вы приорели:\n" + trip);
                    return trip;
                } else {
                    System.out.println("Операция отменена");
                }
            } else if (choice == 3) {
                System.out.println("Операция отменена");
                return null;
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        return null;
    }

    private Trip editor(Trip trip) {
        Trip editTrip = trip;
        int toggle = 0;
        while (true) {

            System.out.println("1-Тип путевки/2-Транспорт/3-Питание/4-Количество дней/5-Сохранить/6-Отмена");
            System.out.print("3/2/Введите команду: ");
            boolean check = false;

            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    for (Map.Entry<String, Double> entry : trip.getTypes().entrySet()) {
                        String view = entry.getKey();
                        System.out.println(view);
                    }
                    System.out.print("Введите тип путевки: ");
                    String type = new Scanner(System.in).nextLine();

                    for (Map.Entry<String, Double> entry : trip.getTypes().entrySet()) {
                        if (!type.equals(entry.getKey())) {
                            check = false;
                        } else {
                            editTrip.setType(type);
                            check = true;
                        }
                    }
                    if (!check) {
                        System.out.println("Некорректный ввод");
                    }
                    check = false;
                    break;
                case 2:
                    for (Map.Entry<String, Double> entry : trip.getTransports().entrySet()) {
                        String transport = entry.getKey();
                        System.out.println(transport);
                    }
                    System.out.print("Введите транспорт: ");
                    String transport = new Scanner(System.in).nextLine();

                    for (Map.Entry<String, Double> entry : trip.getTransports().entrySet()) {
                        if (!transport.equals(entry.getKey())) {
                            check = false;
                        } else {
                            editTrip.setTransport(transport);
                            check = true;
                        }
                    }
                    if (!check) {
                        System.out.println("Некорректный ввод");
                    }
                    check = false;
                    break;

                case 3:
                    System.out.println("Введите true or false: ");
                    editTrip.setFood(new Scanner(System.in).nextBoolean());
                    break;
                case 4:
                    System.out.print("Введите количество дней: ");
                    int number = new Scanner(System.in).nextInt();
                    if (number < 1) {
                        System.out.println("Некорректный ввод");
                    } else {
                        editTrip.setNumberDays(number);
                    }
                    break;
                case 5:
                    return editTrip;
                case 6:
                    editTrip = trip;
                    toggle = 1;
                    break;
            }
            if (toggle == 1) {
                break;
            }
        }
        toggle = 0;
        return null;
    }

    public void sort() {
        trips.sort(Comparator.comparing(Trip::getPrice).reversed());
        for (Trip trip : trips)
            System.out.println(trip);
    }
}
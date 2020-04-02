import java.time.LocalTime;
import java.util.Scanner;

public class Logic {

    private Airline[] array;
    private boolean check = false;

    public Logic(Airline[] array) {
        this.array = array;
    }

    public void searchDestination() {
        System.out.print("Введите пункт назначения: ");
        String name = new Scanner(System.in).nextLine();
        for (Airline airline : array) {
            if (airline.getDestination().equals(name)) {
                System.out.println(airline);
                check = true;
            }
        }
        check(check);
    }

    public void searchWeekday() {
        System.out.print("Введите день недели: ");
        String name = new Scanner(System.in).nextLine();
        for (Airline airline : array) {
            if (airline.getDaysOfTheWeek().equals(name)) {
                System.out.println(airline);
                check = true;
            }
        }
        check(check);
    }

    public void searchData() {
        System.out.print("Введите день недели: ");
        String nameWeekday = new Scanner(System.in).nextLine();
        System.out.print("Введите время(hh:mm): ");
        String nameTime = new Scanner(System.in).nextLine();
        for (Airline airline : array) {
            if (airline.getDaysOfTheWeek().equals(nameWeekday)) {
                if (airline.getDepartureTime().isAfter(LocalTime.parse(nameTime))) {
                    System.out.println(airline);
                    check = true;
                }
            }
        }
        check(check);
    }

    private void check(boolean check) {
        if (!check) {
            System.out.println("Не найдено");
        }
        this.check = false;
    }
}
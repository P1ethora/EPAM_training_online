import java.util.Scanner;

public class AggregateAirline {

    Airline[] airlines;

    public AggregateAirline() {

        airlines = new Airline[]{new Airline("Москва", 15, "Аэробус", "12:00", "Понедельник"),
                new Airline("Минск", 16, "Боинг", "13:00", "Вторник"),
                new Airline("Варшава", 18, "Ил", "14:00", "Вторник"),
                new Airline("Берлин", 19, "Аэробус", "09:00", "Среда"),
                new Airline("Гомель", 20, "Боинг", "15:00", "Вторник")};

        Logic logic = new Logic(airlines);

        System.out.println("1- пункта назначения/2-дня недели/3-дня недели и времени/4-выход");

        while (true) {
            int i = 0;
            System.out.print("Ваш выбор: ");
            switch (new Scanner(System.in).nextInt()) {

                case 1:
                    logic.searchDestination();
                    break;
                case 2:
                    logic.searchWeekday();
                    break;
                case 3:
                    logic.searchData();
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
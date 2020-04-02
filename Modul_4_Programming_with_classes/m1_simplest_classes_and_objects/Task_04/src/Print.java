import java.util.Scanner;

public class Print {


    public Print(Train[] trains) {
        print(trains);
    }

    private void print(Train[] trains) {
        System.out.print("Введите номер поезда: ");
        int n = new Scanner(System.in).nextInt();
        boolean check = false;
        for (Train train : trains) {
            if (train.getNumber() == n) {
                check = true;
                System.out.println("Поезд - \"" + train.getDestination() + "\" Номер - \""
                        + train.getNumber() + "\" Веремя отправления - \""
                        + train.getDepartureTime() + "\"");
                break;
            }
        }

        if (!check) {
            System.out.println("Поезд отсутствует");
            System.out.print("Имеются следующие поезда : ");
            for (Train tr : trains) {
                System.out.print(tr.getNumber() + ", ");
            }
            System.out.println();
        }
    }
}
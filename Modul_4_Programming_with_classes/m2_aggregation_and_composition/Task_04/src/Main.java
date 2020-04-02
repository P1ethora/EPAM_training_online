import java.util.Scanner;

/**
 * Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
 * счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный балансы отдельно
 */

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Игорь", "Клакоцкий", new BankAccount("12345678"));
        client.addBankAccount(new BankAccount("22222333"), client.getBankAccounts());
        client.addBankAccount(new BankAccount("44422333"), client.getBankAccounts());
        client.addBankAccount(new BankAccount("55555000"), client.getBankAccounts());
        client.addBankAccount(new BankAccount("99999000"), client.getBankAccounts());

        client.addCashSystem("22222333", client.getBankAccounts(), 100);
        client.addCashSystem("44422333", client.getBankAccounts(), 200);
        client.addCashSystem("55555000", client.getBankAccounts(), -50);
        client.addCashSystem("99999000", client.getBankAccounts(), -30);

        System.out.println("1-Поиск счета; 2-сортировка счетов; 3-общая сумма; 4 - положить на счет\n5-снять со счета; 6-разблокировать; 7-заблокировать; 8-закончить");
        while (true) {
            int toggle = 0;
            System.out.print("Введите команду: ");

            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    System.out.println(client.searchBankAccount(client.getBankAccounts()));
                    break;
                case 2:
                    client.sortAccount(client.getBankAccounts());
                    break;
                case 3:
                    client.sumMoney(client.getBankAccounts());
                    break;
                case 4:
                    client.addCash(client.getBankAccounts());
                    break;
                case 5:
                    client.dissCash(client.getBankAccounts());
                    break;
                case 6:
                    client.unlockAccount(client.getBankAccounts());
                    break;
                case 7:
                    client.blockAccount(client.getBankAccounts());
                    break;
                case 8:
                    toggle = 1;
                    break;
            }
            if (toggle == 1) break;

        }
    }
}
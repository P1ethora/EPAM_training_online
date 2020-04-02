import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public interface Management {

    default BankAccount searchBankAccount(ArrayList<BankAccount> bankAccounts) {
        System.out.print("Введите номер счета: ");
        String number = new Scanner(System.in).nextLine();
        for (BankAccount account : bankAccounts) {
            if (number.equals(account.getNumberAccount())) {
                return account;
            }
        }
        System.out.println("Лицевой счет не найден");
        return null;
    }

    default void blockAccount(ArrayList<BankAccount> bankAccounts) {
        System.out.print("Введите номер счета: ");
        String number = new Scanner(System.in).nextLine();
        for (BankAccount account : bankAccounts) {
            if (number.equals(account.getNumberAccount())) {
                account.setLock(true);
                System.out.println("Счет успешно заблокирован");
            }
        }
    }

    default void unlockAccount(ArrayList<BankAccount> bankAccounts) {
        System.out.print("Введите номер счета: ");
        String number = new Scanner(System.in).nextLine();
        for (BankAccount account : bankAccounts) {
            if (number.equals(account.getNumberAccount())) {
                account.setLock(false);
                System.out.println("Счет успешно разблокирован");
            }
        }
    }

    default void addBankAccount(BankAccount bankAccount, ArrayList<BankAccount> bankAccounts) {
        bankAccounts.add(bankAccount);

    }

    default void addCash(ArrayList<BankAccount> bankAccounts) {
        System.out.print("Введите номер счета: ");
        String number = new Scanner(System.in).nextLine();
        System.out.print("Количество денег: ");
        double sum = new Scanner(System.in).nextDouble();
        for (BankAccount account : bankAccounts) {
            if (number.equals(account.getNumberAccount())) {
                account.plusMoney(sum);
            }
        }
    }

    default void addCashSystem(String bankAccount, ArrayList<BankAccount> bankAccounts, double sum) {
        for (BankAccount account : bankAccounts) {
            if (bankAccount.equals(account.getNumberAccount())) {
                account.plusMoney(sum);
            }
        }
    }

    default void dissCash(ArrayList<BankAccount> bankAccounts) {
        System.out.print("Введите номер счета: ");
        String number = new Scanner(System.in).nextLine();
        System.out.print("Количество денег: ");
        double sum = new Scanner(System.in).nextDouble();
        for (BankAccount account : bankAccounts) {
            if (number.equals(account.getNumberAccount())) {
                account.dissMoney(sum);
            }
        }
    }

    default void sortAccount(ArrayList<BankAccount> bankAccounts) {
        //TODO обобщить код повторы засунуть в общий метод
        bankAccounts.sort(Comparator.comparing(BankAccount::getMoney).reversed());
        System.out.println();
        for (BankAccount bankAccount : bankAccounts)
            System.out.println(bankAccount);
    }

    default void sumMoney(ArrayList<BankAccount> bankAccounts) {
        double sum = 0;
        double sumDis = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getMoney() != 0 && bankAccount.getMoney() > 0)
                sum += bankAccount.getMoney();
            if (bankAccount.getMoney() != 0 && bankAccount.getMoney() < 0)
                sumDis += bankAccount.getMoney();
        }

        System.out.println("Положительные счета = " + sum);
        System.out.println("Отрицательные счета = " + sumDis);
        System.out.println("Итого = " + (sum + sumDis));
    }
}
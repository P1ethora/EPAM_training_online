package pl.client.view;

import pl.client.logicClient.ChangeLineAccountFile;
import pl.content.forAccount.Account;
import pl.content.forAccount.BaseAccounts;
import pl.content.forAccount.role.AppointedAdmin;
import pl.content.forAccount.role.AppointedUser;

import java.util.Scanner;

public class SuperAdmin implements View {

    public SuperAdmin() {


        while (true) {

            System.out.println("1-Назначить администратора/2-Разжаловать администратора/3-Количество пользователей/4-Закрыть");
            System.out.print("Введите команду: ");
            int number = new Scanner(System.in).nextInt();
            if (number == 1) {userRole("admin");}
            else if (number == 2) {userRole("user");}
            else if (number == 3) {System.out.println(BaseAccounts.baseAccounts.size());}
            else if (number == 4) {break;}
            else System.out.println("Неверный ввод1");
        }
    }

    private void userRole(String role) {
        boolean check = false;
        BaseAccounts.baseAccounts.forEach(System.out::println);
        System.out.println("Введите логин : ");
        String login = new Scanner(System.in).nextLine();
        for (Account account : BaseAccounts.baseAccounts) {
            if (account.getLogin().equals(login)) {
                String lineAccount = account.getLogin() + "!" + account.getEmail() + "!" + account.getPassword() + "!" + account.getRole();

                    account.setRole(role);


                String newline = account.getLogin() + "!" + account.getEmail() + "!" + account.getPassword() + "!" + account.getRole();
                ChangeLineAccountFile changeLineFile = new ChangeLineAccountFile(lineAccount, newline);
                check = true;
                break;
            }


        }
        if (!check) {
            System.out.println("Неверный логин");
        }
        check = false;
    }
}
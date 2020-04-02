package pl.client;

import org.mindrot.jbcrypt.BCrypt;
import pl.client.logicClient.ChangeLineAccountFile;
import pl.client.view.AdminView;
import pl.client.view.SuperAdmin;
import pl.client.view.UserView;
import pl.client.view.View;
import pl.content.forAccount.Account;
import pl.content.forAccount.BaseAccounts;
import pl.content.forAccount.logicAccount.NewAccount;

import java.util.Scanner;

public class Client implements View {

    private Account account;

    public Client() throws Exception {
        while (true) {
            System.out.println("1-Войти/2-Регистрация/3-Выйти");
            System.out.println("Введите команду: ");
            int comm = new Scanner(System.in).nextInt();
            if (comm == 1) {

                System.out.print("Введите логин: ");
                String login = new Scanner(System.in).nextLine();
                System.out.println("Введите пароль: ");
                String password = new Scanner(System.in).nextLine();
                account = checkUser(login, password);
                if (account != null) {
                    System.out.println("Вы вошли как " + account);
                } else {
                    System.out.println("Неверный логин или пароль");
                }

                checkRole(account);
            } else if (comm == 2) {
                NewAccount newAccount = new NewAccount();
            } else if (comm == 11111) {
                new SuperAdmin();

            } else break;
        }
    }

    private Account checkUser(String login, String password) {

        for (Account account : BaseAccounts.baseAccounts) {
            if (account.getLogin().equals(login)) {
                if (BCrypt.checkpw(password, account.getPassword()))
                    return account;
            }
        }
        return null;
    }

    private View checkRole(Account account) throws Exception {

        if (account.getRole().equals("admin")) {
            return new AdminView();
        } else
            return new UserView(account.getLogin());
    }

    public Account getAccount() {
        return account;
    }

}
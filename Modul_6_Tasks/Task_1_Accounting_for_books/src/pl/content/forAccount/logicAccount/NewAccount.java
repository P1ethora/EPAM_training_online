package pl.content.forAccount.logicAccount;

import org.mindrot.jbcrypt.BCrypt;
import pl.content.FileReference;
import pl.content.forAccount.Account;
import pl.content.forAccount.BaseAccounts;

import java.io.*;
import java.util.Scanner;

public class NewAccount {

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                    "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String LOGIN_PATTERN =
            "^[A-Za-z]([.A-Za-z0-9-]{1,18})([A-Za-z0-9])$";
    private static final String PASSWORD_PATTERN =
            "(?=.*[a-z])(?=.*[0-9]).{8,}";

    public NewAccount() throws Exception {

        System.out.print("Введите логин: ");
        String login = new Scanner(System.in).nextLine();
        if (!login.matches(LOGIN_PATTERN)) {
            throw new Exception("Некорректный ввод");
        }
        if (!checkAccount(login, "login")) {
            throw new Exception("Такой логин уже существует");
        }

        System.out.print("Введите email: ");
        String email = new Scanner(System.in).nextLine();
        if (!email.matches(EMAIL_PATTERN)) {
            throw new Exception("Некорректный ввод");
        }
        if (!checkAccount(email, "email")) {
            throw new Exception("Такой email уже существует");
        }
        System.out.print("Введите пароль: ");
        String password = new Scanner(System.in).nextLine();
        if (!password.matches(PASSWORD_PATTERN)) {
            throw new Exception("Пароль должен содержать не менее 8 символов, включая цифры и латинские буквы");
        }

        Account account = null;
        String hashPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        String appendText = login + "!" + email + "!" + hashPassword + "!user" + "\n";
        appendUsingOutputStream(appendText);

        account = new Account(login, email, hashPassword, "user");
        BaseAccounts.baseAccounts.add(account);
    }

    private void appendUsingOutputStream(String data) throws Exception {

        FileWriter fw = new FileWriter(FileReference.fileAccounts, true);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write(data);
        writer.close();


    }

    public boolean checkAccount(String string, String item) throws Exception {

        for (Account account : BaseAccounts.baseAccounts) {

            if (item.equals("login")) {
                if (account.getLogin().equals(string)) {
                    return false;
                }
            } else if (item.equals("email")) {
                if (account.getEmail().equals(string)) {
                    return false;
                }
            } else throw new Exception();
        }
        return true;
    }
}
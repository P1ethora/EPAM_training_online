package pl.content.forAccount.role;

import pl.content.forAccount.Account;

public class AppointedUser {

    public AppointedUser(Account account) {

        account.setRole("user");

    }
}
package pl.content.forAccount.role;

import pl.content.forAccount.Account;

public class AppointedAdmin {

    public AppointedAdmin(Account account) {

        account.setRole("admin");

    }

}
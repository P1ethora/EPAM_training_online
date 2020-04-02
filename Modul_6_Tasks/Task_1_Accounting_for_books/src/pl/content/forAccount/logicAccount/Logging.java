package pl.content.forAccount.logicAccount;

import pl.content.forAccount.Account;
import java.util.StringTokenizer;

public class Logging {

    private Account account;

    public Logging(String login) {
        StringTokenizer st = new StringTokenizer(login, "!");

        account = new Account(st.nextToken(), st.nextToken(), st.nextToken(),st.nextToken());
    }

    public Account getAccount() {
        return account;
    }


}
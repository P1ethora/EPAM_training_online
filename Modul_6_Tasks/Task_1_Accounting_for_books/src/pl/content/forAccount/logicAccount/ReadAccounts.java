package pl.content.forAccount.logicAccount;

import pl.content.FileReference;
import pl.content.forAccount.BaseAccounts;

import java.io.*;

public class ReadAccounts {

    public void readAccounts() {

        try {
            File file = new File(FileReference.fileAccounts);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {

                Logging logging = new Logging(line);
                BaseAccounts.baseAccounts.add(logging.getAccount());
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
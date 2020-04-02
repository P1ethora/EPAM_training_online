package pl.client.logicClient;

import pl.content.FileReference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ChangeLineAccountFile {

    public ChangeLineAccountFile(String lineAccount, String newLine) {
        try {
            File f = new File(FileReference.fileAccounts);
            BufferedReader file = new BufferedReader(new FileReader(f));
            String line;
            StringBuilder inputBuffer = new StringBuilder();

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            String inputStr = inputBuffer.toString();

            file.close();

            inputStr = inputStr.replace(lineAccount, newLine);

            FileOutputStream fileOut = new FileOutputStream(f);
            fileOut.write(inputStr.getBytes());
            fileOut.close();

        } catch (Exception e) {
            System.out.println("Пролемы с чтением фала");
        }
    }
}
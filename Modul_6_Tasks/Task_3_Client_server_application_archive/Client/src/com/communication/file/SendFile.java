package com.communication.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Класс для отправки обновленного файла на сервер
 */
public class SendFile {

    public SendFile(Socket socket) throws Exception {
        OutputStream outputStream = socket.getOutputStream();

        String name = "src\\com\\hashFile\\persons.xml";
        File myFile = new File(name);
        byte[] buffer = new byte[(int) myFile.length()];
        FileInputStream fis = new FileInputStream(myFile);
        BufferedInputStream in = new BufferedInputStream(fis);

        in.read(buffer, 0, buffer.length);
        outputStream.write(buffer, 0, buffer.length);
        outputStream.flush();

        in.close();
        fis.close();
        outputStream.close();
        socket.close();

    }
}

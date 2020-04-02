package com.communication.file;

import java.io.*;
import java.net.Socket;


/**
 * Класс для приема файла от сервера
 */
public class ReceiveFile {

    public ReceiveFile(Socket socket) throws Exception {

        String name = "src\\com\\hashFile\\persons.xml";

        byte[] buffer = new byte[16384];
        InputStream is = socket.getInputStream();

        int byteread;

        File test = new File(name);

        FileOutputStream fos = new FileOutputStream(test);
        BufferedOutputStream out = new BufferedOutputStream(fos);


        while ((byteread =  is.read(buffer, 0, buffer.length)) != -1)
         out.write(buffer, 0, byteread);
        out.flush();
        System.out.println("Список архива получен");
        out.close();
        fos.close();
        socket.close();

    }
}
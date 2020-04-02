package com.communication;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class ReceiveFile {

    public ReceiveFile(Socket socket) throws Exception {

        String name = "src\\com\\dataBase\\persons.xml";

        byte[] buffer = new byte[16384];
        InputStream is = socket.getInputStream();

        int byteread;
        File test = new File(name);
        FileOutputStream fos = new FileOutputStream(test);
        BufferedOutputStream out = new BufferedOutputStream(fos);


        while ((byteread =  is.read(buffer, 0, buffer.length)) != -1)
         out.write(buffer, 0, byteread);
System.out.println("Файл получен");
         out.close();                        //TODO тут нужно продумать получше

    }
}
package com.communication;

import java.io.*;
import java.net.Socket;

public class SendFile {

    public SendFile(Socket socket) throws Exception {

        String name = "src\\com\\dataBase\\persons.xml";

        OutputStream outputStream = socket.getOutputStream();

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



    }

}

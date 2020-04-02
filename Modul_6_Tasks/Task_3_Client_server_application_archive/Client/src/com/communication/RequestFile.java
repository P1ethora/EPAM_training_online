package com.communication;

import com.communication.file.ReceiveFile;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class RequestFile {

    public RequestFile() throws Exception {

        Socket socket = new Socket("127.0.0.1",9001);
        PrintWriter out1 = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        out1.println("showPerson");
        System.out.println("Запрос showPerson отправлен");
        System.out.println("Жду ответа сервера...");

        ReceiveFile receiveFile = new ReceiveFile(socket);

    }
}

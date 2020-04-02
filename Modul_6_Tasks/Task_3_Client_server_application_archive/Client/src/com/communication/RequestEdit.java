package com.communication;

import com.communication.file.SendFile;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RequestEdit {

public RequestEdit() throws Exception {

    Socket socket = new Socket("127.0.0.1", 9001);
    PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
    Scanner scanner = new Scanner(socket.getInputStream());

        out.println("editPerson");
        System.out.println("Запрос editPerson отправлен");

    String resp = scanner.nextLine();
        if (resp.equals("yes")) {
            System.out.println("Сервер принял запрос");
            SendFile sendFile = new SendFile(socket);

        }
    }

}

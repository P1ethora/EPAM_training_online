package com.communication;

import com.view.CreateAccountDialogController;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RequestCreateAccount {

    public RequestCreateAccount(String login,String password) throws Exception {

        Socket socket = new Socket("127.0.0.1", 9001);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        Scanner scanner = new Scanner(socket.getInputStream());

        out.println("NewCreateAccount");
        System.out.println("Запрос NewCreateAccount отправлен");

        out.println(login);
        out.println(password);

        if (scanner.nextLine().equals("true")) { CreateAccountDialogController.handlOkCheck = true;}
        else {
            CreateAccountDialogController.handlOkCheck = false;
        }
        //TODO дороботать проверку логинов и вывести сообщение об ошибке в граф интерфейс
    }

}

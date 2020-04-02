package com.communication;

import com.view.LoginOverviewController;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RequestLogin {

    public static boolean role = false;
    public static String log;

    public RequestLogin(String login, String password) throws IOException {

        Socket socket = new Socket("127.0.0.1", 9001);
        PrintWriter out1 = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        Scanner scanner = new Scanner(socket.getInputStream());

        out1.println("signIn");
        System.out.println("Запрос signIn отправлен");

        out1.println(login);
        out1.println(password);
        System.out.println("Запрос логин-пароль отправлен");

        if (scanner.nextLine().equals("true")) {
            LoginOverviewController.validate = true;
           if (scanner.nextLine().equals("admin")) {role = true;}
           log = login;
            socket.close();
            System.out.println("Вы вошли");
        } else {
            LoginOverviewController.validate = false;

        }
    }
}
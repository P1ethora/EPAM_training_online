package com;

import com.communication.ReceiveFile;
import com.communication.SendFile;
import com.personRole.CreateLogin;
import com.personRole.Login;
import com.personRole.PersonRole;
import com.readerAndWriter.XMLjdomReader;
import org.mindrot.jbcrypt.BCrypt;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws Exception {

        XMLjdomReader reader = new XMLjdomReader();          //считываем логины перед запуском сервера

        try (ServerSocket serverSocket = new ServerSocket(9001)) {    //запуск многопоточного сервера
            System.out.println("Server started...");

            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new MyServer(socket)).start();
            }
        }
    }
}

//Поток
class MyServer implements Runnable {
    private Socket socket;

    MyServer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (Scanner scanner = new Scanner(socket.getInputStream())) {
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

            while (scanner.hasNextLine()) {      //Приход запросов от клиента

                String requestClient = scanner.nextLine(); //Запись запроса для сравнения


                if (requestClient.equals("signIn")) {     //запрос на вход
                    String login = scanner.nextLine();   //считывание логина
                    String password = scanner.nextLine(); //считывание пароля
                    boolean ok = false;                   // одобрение

                    XMLjdomReader read = new XMLjdomReader();  //Считываем файл с аккаунтами

                    for (Login a : PersonRole.logins) {     //Проверяем на наличие аккаунта

                        //if (a.getLogin().equals(login) && a.getPassword().equals(password)) {
                        if (a.getLogin().equals(login)) {
                               if (BCrypt.checkpw(password, a.getPassword())){
                            out.println("true");
                            out.println(a.getRole());
                            System.out.println(login + " вошел на сервер");
                            ok = true;
                            break;
                        }
                    }
                    }
                    if (!ok) {    //Если аккаунт на нашелся клиент получает false
                        out.println("false");
                    }


                } else if (requestClient.equals("showPerson")) {   //Запрос на показ архива

                    SendFile send = new SendFile(socket);  //передаем данные клиенту
                    System.out.println("Архив отправлен клиенту");


                } else if (requestClient.equals("newPerson")) {   //Запрос на создание новой единицы архива
                    out.println("yes");                            //Одобрение
                    ReceiveFile receiveFile = new ReceiveFile(socket);  //Прием новых данных
                    System.out.println("В базу произведено доавление");

                } else if (requestClient.equals("deletePerson")) {  //Запрос на удаление
                    out.println("yes");
                    ReceiveFile receiveFile = new ReceiveFile(socket);
                    System.out.println("В базе произведено удаление");

                } else if (requestClient.equals("editPerson")) {   //Запрос изменения
                    out.println("yes");
                    ReceiveFile receiveFile = new ReceiveFile(socket);
                    System.out.println("В базе произведено изменение");

                } else if (requestClient.equals("NewCreateAccount")) {          //Запрос на Создание нового аккаунта

                    String newLogin = scanner.nextLine();
                    String newPassword = scanner.nextLine();

                   boolean check = true;
                    for (Login g : PersonRole.logins) {             //Проверка на оригинальность
                        if (g.getLogin().equals(newLogin)) {check = false; break;}
                  //else {check = true;}
                    }
                    if(check){
                    CreateLogin createLogin = new CreateLogin(newLogin, newPassword);     //Метод генерации аккаунта
                        out.println("true");
                        System.out.println("Новый аккаут создан");}
                    else {out.println("false");}
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
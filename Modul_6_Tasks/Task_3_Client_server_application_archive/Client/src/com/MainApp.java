package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Создайте киент-серверное приложение "Архив" .
 * В архиве хранятся дела. Архив находится на сервере.
 * Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
 * него изменения, или создать новое дело.
 */

public class MainApp extends Application {

    public static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {

        MainApp.primaryStage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("view/LoginOverview.fxml"));

        primaryStage.setTitle("Archive");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
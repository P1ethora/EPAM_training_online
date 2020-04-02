package com.stratWindow;

import com.MainApp;
import com.communication.RequestFile;
import com.communication.RequestLogin;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class StartPersonOverview {

    public static Stage stagePerson = new Stage();

    public void start() throws Exception {

        RequestFile requestFile = new RequestFile();
        FXMLLoader fxmlLoader;

        if(RequestLogin.role){
        fxmlLoader = new FXMLLoader(MainApp.class.getResource("view/PersonOverview.fxml"));}
        else {
        fxmlLoader = new FXMLLoader(MainApp.class.getResource("view/PersonOverviewGuest.fxml"));}
        Parent root = fxmlLoader.load();

        MainApp.primaryStage.hide();              //Скрываем окно входа

        stagePerson.initModality(Modality.APPLICATION_MODAL);
        stagePerson.setOpacity(1);
        stagePerson.setTitle("Archive");
        stagePerson.setScene(new Scene(root, 600, 400));
        stagePerson.showAndWait();

    }

    public static Stage getStagePerson() {
        return stagePerson;
    }

}

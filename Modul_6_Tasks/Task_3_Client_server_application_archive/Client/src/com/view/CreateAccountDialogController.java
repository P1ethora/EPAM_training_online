package com.view;

import com.communication.RequestCreateAccount;
import com.model.Person;
import com.other.DateUtil;
import com.readerAndwriter.XMLjdomWriter;
import com.stratWindow.StartCreateAccountDialog;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccountDialogController {

    @FXML
    TextField login;
    @FXML
    TextField password;
    @FXML
    Label checkLogin;

    private Stage dialogStage;
    private boolean okClicked = false;

    public static boolean handlOkCheck;

    //private Person person;


    /**
     * Инициализирует класс-контроллер. Этот метод вызывается автоматически
     * после того, как fxml-файл будет загружен.
     */
    @FXML
    private void initialize() {
    }

    /**
     * Устанавливает сцену для этого окна.
     *
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    /**
     * Задаёт адресата, информацию о котором будем менять.
     *
     * @param person
     */


    /**
     * Returns true, если пользователь кликнул OK, в другом случае false.
     *
     * @return
     */
    public boolean isOkClicked() {
        return okClicked;
    }

    /**
     * Вызывается, когда пользователь кликнул по кнопке OK.
     */
    @FXML
    private void handleOk() throws Exception {
//TODO нужна проверка на пустые строки

            RequestCreateAccount requestCreateAccount = new RequestCreateAccount(login.getText(),password.getText());

            okClicked = true;

            if(handlOkCheck) {
                dialogStage.close();

            }
            else {
                checkLogin.setTextFill(Color.RED);
                checkLogin.setText("Пользователь с таким именем существует");}


    }

    /**
     * Вызывается, когда пользователь кликнул по кнопке Cancel.
     */
    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    /**
     * Проверяет пользовательский ввод в текстовых полях.
     *
     * @return true, если пользовательский ввод корректен
     */


}

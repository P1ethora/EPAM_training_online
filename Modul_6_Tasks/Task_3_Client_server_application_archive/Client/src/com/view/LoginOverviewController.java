package com.view;

import com.communication.RequestCreateAccount;
import com.communication.RequestLogin;
import com.stratWindow.StartCreateAccountDialog;
import com.stratWindow.StartPersonOverview;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;


public class LoginOverviewController {

    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    public static Label signInFalse;
    @FXML
    Button buttonSignIn;
    @FXML
    Button buttonCreateAccount;

    public static boolean validate;       //проверка пользователя


    public void OnClick() throws Exception {

        RequestLogin request = new RequestLogin(login.getText(),password.getText());

        if (validate) {
                validate = false;

                StartPersonOverview start = new StartPersonOverview();
                start.start();

                login.clear();
                password.clear();

        } else {
            //signInFalse.setTextFill(Color.RED);
            signInFalse.setText("Неверный логин или пароль");
        }
    }

    public void OnClickCreateAccount() throws Exception {

        StartCreateAccountDialog startCreateAccountDialog = new StartCreateAccountDialog();
        startCreateAccountDialog.start();
    }

}
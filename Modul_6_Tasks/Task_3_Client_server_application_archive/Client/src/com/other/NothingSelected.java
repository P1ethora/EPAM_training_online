package com.other;

import com.stratWindow.StartPersonOverview;
import javafx.scene.control.Alert;

public class NothingSelected {

    public NothingSelected() {

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.initOwner(StartPersonOverview.getStagePerson());
        alert.setTitle("No Selection");
        alert.setHeaderText("No Person Selected");
        alert.setContentText("Please select a person in the table.");

        alert.showAndWait();

    }
}

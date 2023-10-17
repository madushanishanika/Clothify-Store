package edu.icet.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SuppliersFormController {

    @FXML
    private Label supplierIdLabel;

    @FXML
    private Label supplierNameLabel;

    @FXML
    private JFXComboBox<?> contactDetailsLabel;

    @FXML
    private JFXComboBox<?> supplierNameCmbBox;

    @FXML
    private Label companyLabel;

    @FXML
    private Label supplierNameLabel2;

    @FXML
    private JFXTextField contactDetailsText;

    @FXML
    private JFXTextField companyText;

    @FXML
    void clearButtonOnAction(ActionEvent event) {

    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {

    }

}

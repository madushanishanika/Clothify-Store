package edu.icet.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class SuppliersFormController implements Initializable {

    public JFXTextField supplierNameText;
    public Label supplierNameLabel1;
    public ComboBox cmbTittle;
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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadCmbTitel();
    }
    @FXML
    void clearButtonOnAction(ActionEvent event) {

    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {

    }
    public void loadCmbTitel(){
        ObservableList<String> obs = FXCollections.observableArrayList("Mr.", "Mrs.");
        cmbTittle.getItems().addAll(obs);
    }
}

package edu.icet.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import edu.icet.util.CrudUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ItemFormController implements Initializable {

    public ComboBox cmbTypeN;
    public ComboBox cmbSize;
    public ComboBox cmbSupplierName;
    public ComboBox cmbSupplierId;
    @FXML
    private Label itemFormLabel;

    @FXML
    private Label itemIdLable;

    @FXML
    private JFXTextField itemIdText;

    @FXML
    private Label itemIdLable1;

    @FXML
    private Label itemIdLable2;

    @FXML
    private Label typeLable;

    @FXML
    private Label byingPriceLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label quntityLabel;

    @FXML
    private Label supplierIdLabel;

    @FXML
    private Label sellingPriceLabel;

    @FXML
    private Label supplierNameLabel;

    @FXML
    private JFXTextField quantityText;

    @FXML
    private JFXTextField descriptionText;

    @FXML
    private JFXTextField profitText;

    @FXML
    private JFXTextField sellingPriceText;

    @FXML
    private JFXTextField byingPriceText;

    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadCmbType();
        loadSizeCmbBox();
    }

    @FXML
    void UpdateButtonOnAction(ActionEvent event) {

    }

    @FXML
    void addButtonOnAction(ActionEvent event) {

    }

   @FXML
    void clearButtonOnAction(ActionEvent event) {

        itemIdText.clear();
        descriptionText.clear();
        quantityText.clear();
        byingPriceText.clear();
        sellingPriceText.clear();
        cmbTypeN.setValue(null);
        cmbSize.setValue(null);
        cmbSupplierId.setValue(null);
        profitText.clear();
    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {

    }


    public void loadCmbType(){
        ObservableList<String> obs = FXCollections.observableArrayList("Male", "Female", "Kids");
        cmbTypeN.getItems().addAll(obs);
    }


    public void loadSizeCmbBox(){
        ObservableList<String> obsList = FXCollections.observableArrayList("Small", "Medium","Large");
        cmbSize.getItems().addAll(obsList);
    }
    public void loadCmbSupId(){
        try {
            ResultSet resultSet = CrudUtil.execute("SELECT id FROM supplier");
            ObservableList<String> supplierId = FXCollections.observableArrayList();

            while(resultSet.next()){
                supplierId.add(resultSet.getString(1));
            }

            cmbSupplierId.setItems(supplierId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

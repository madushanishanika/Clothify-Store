package edu.icet.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class OrdersFormController {
    private Stage stage;
    @FXML
    private Label customerIdLable;

    @FXML
    private JFXTextField customerContactText;

    @FXML
    private Label customerContactLable;

    @FXML
    private Label paymentMethodLable;

    @FXML
    private Label employeeIdLable;

    @FXML
    private Label orderIdLable;

    @FXML
    private JFXTextField orderIdText;

    @FXML
    private Label orderDateLable;

    @FXML
    private JFXTextField orderDateText;

    @FXML
    private JFXTextField employeeIdText;

    @FXML
    private JFXTextField customerIdText;

    @FXML
    private Label customerNameLable;

    @FXML
    private JFXTextField customerNameText;

    @FXML
    private Label itemIdLable;

    @FXML
    private JFXTextField itemIdText;

    @FXML
    private Label descriptionLable;

    @FXML
    private Label quntityLable;

    @FXML
    private JFXCheckBox cashCheckBox;

    @FXML
    private JFXCheckBox cardCheckBox;

    @FXML
    private TreeTableColumn<?, ?> itemIdColum;

    @FXML
    private TreeTableColumn<?, ?> descriptionColum;

    @FXML
    private TreeTableColumn<?, ?> QtyColum;

    @FXML
    private TreeTableColumn<?, ?> unitPriceColum;

    @FXML
    private TreeTableColumn<?, ?> typeColum;

    @FXML
    private TreeTableColumn<?, ?> sizeColum;

    @FXML
    private JFXTextField sizeText;

    @FXML
    private Label totalLable;

    @FXML
    private Label totalPriceLable;

    @FXML
    private Label totDiscountLable;

    @FXML
    private Label totDiscountViewLable;

    @FXML
    private Label cashLable;

    @FXML
    private Label cashViewLable;

    @FXML
    private Label balanceLable;

    @FXML
    private Label balanceViewLable;

    @FXML
    private Label typeLable;

    @FXML
    private Label unitPriceLable;

    @FXML
    private Label sizeLable;

    @FXML
    private JFXTextField typeText;

    @FXML
    private JFXTextField unitPriceText;

    @FXML
    private JFXTextField quantityText;

    @FXML
    private JFXTextField descriptionText;
    private Scene scene;

    public void orderButtonOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/orders.fxml"));
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public void itemButtonOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/view/items.fxml"));
        stage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        scene=new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    public void removeItemButtonOnAction(ActionEvent actionEvent) {
    }

    public void placeOrderButtonOnAction(ActionEvent actionEvent) {
    }

    public void clearButtonOnAction(ActionEvent actionEvent) {
    }

    public void addButtonOnAction(ActionEvent actionEvent) {
    }

    public void updateButtonOnAction(ActionEvent actionEvent) {
    }

    public void suppliersButtonOnAction(ActionEvent actionEvent) {
    }

    public void salesReportsButtonsOnAction(ActionEvent actionEvent) {
    }

    public void employeeButtonOnAction(ActionEvent actionEvent) {
    }

    public void orderDetailsButtonOnAction(ActionEvent actionEvent) {
    }

    public void salesReturnsButtonOnAction(ActionEvent actionEvent) {
    }
}

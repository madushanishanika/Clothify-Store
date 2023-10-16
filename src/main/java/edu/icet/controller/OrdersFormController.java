package edu.icet.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class OrdersFormController {
    private Stage stage;
    public JFXButton orderButton;
    public JFXButton orderButton3;
    public JFXButton orderButton2;
    public JFXButton orderButton1;
    public JFXButton orderButton4;
    public JFXButton orderButton5;
    public JFXButton orderButton6;
    public Label customerIdLable1;
    public JFXTextField customerNameText1;
    public Label employeeIdLable1;
    public Label orderDateLable1;
    public Label customerNameLable1;
    public Label paymentMethodLable;
    public Label customerContactLable;
    public Label unitPriceLable;
    public Label descriptionLable;
    public Label orderIdLable;
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
}

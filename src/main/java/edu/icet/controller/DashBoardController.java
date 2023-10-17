package edu.icet.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class DashBoardController {
    public AnchorPane dashBoardPane;
    public AnchorPane rootPane;

    public void orderButtonOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/orders.fxml");
        assert resource != null;
        Parent load;
        try {
            load = FXMLLoader.load(resource);
            rootPane.getChildren().clear();
            rootPane.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void itemButtonOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/items.fxml");
        assert resource != null;
        Parent load;
        try {
            load = FXMLLoader.load(resource);
            rootPane.getChildren().clear();
            rootPane.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salesReturnsButtonOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/salesReturns.fxml");
        assert resource != null;
        Parent load;
        try {
            load = FXMLLoader.load(resource);
            rootPane.getChildren().clear();
            rootPane.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void orderDetailsButtonOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/orderDetails.fxml");
        assert resource != null;
        Parent load;
        try {
            load = FXMLLoader.load(resource);
            rootPane.getChildren().clear();
            rootPane.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void employeeButtonOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/employees.fxml");
        assert resource != null;
        Parent load;
        try {
            load = FXMLLoader.load(resource);
            rootPane.getChildren().clear();
            rootPane.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void suppliersButtonOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/suppliers.fxml");
        assert resource != null;
        Parent load;
        try {
            load = FXMLLoader.load(resource);
            rootPane.getChildren().clear();
            rootPane.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salesReportsButtonsOnAction(ActionEvent actionEvent) {
        URL resource = this.getClass().getResource("/view/salesReports.fxml");
        assert resource != null;
        Parent load;
        try {
            load = FXMLLoader.load(resource);
            rootPane.getChildren().clear();
            rootPane.getChildren().add(load);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitButtonOnAction(ActionEvent actionEvent) {
    }
}

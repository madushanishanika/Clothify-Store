package edu.icet.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import edu.icet.entity.Supplier;
import edu.icet.util.CrudUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SuppliersFormController implements Initializable {

    public JFXTextField supplierNameText;
    public Label supplierNameLabel1;
    public ComboBox cmbTittle;
    public Label lblSupplierId;
    @FXML
    private Label supplierIdLabel;

    @FXML
    private Label supplierNameLabel;

    @FXML
    private JFXComboBox<?> contactDetailsLabel;

    @FXML
    private Label companyLabel;

    @FXML
    private Label supplierNameLabel2;

    @FXML
    private JFXTextField supContactDetailsText;

    @FXML
    private JFXTextField supCompanyText;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadCmbTitel();
    }
    @FXML
    void clearButtonOnAction(ActionEvent event) {
        cmbTittle.setValue(null);
        supplierNameText.clear();
        lblSupplierId.setText("");
        supContactDetailsText.clear();
        supCompanyText.clear();
    }

    @FXML
    void saveButtonOnAction(ActionEvent event) {
        Supplier supplier = new Supplier(lblSupplierId.getText(), cmbTittle.getValue().toString(), supplierNameText.getText(), supContactDetailsText.getText(), supCompanyText.getText());
        try {
            boolean isAdded = CrudUtil.execute("INSERT INTO supplier VALUES(?,?,?,?,?)",
                    supplier.getSupID(),
                    supplier.getTitle(),
                    supplier.getSupName(),
                    supplier.getSupContactNumber(),
                    supplier.getSupCompany());

            if(isAdded){
                new Alert(Alert.AlertType.INFORMATION,"Supplier Saved..!").show();
//                clearFields();
//                loadTable();
            }else{
                new Alert(Alert.AlertType.ERROR,"Something went wrong..!").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void loadCmbTitel(){
        ObservableList<String> obs = FXCollections.observableArrayList("Mr.", "Mrs.");
        cmbTittle.getItems().addAll(obs);
    }
}

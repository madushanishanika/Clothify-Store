package edu.icet.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import edu.icet.dto.SupplierTm;
import edu.icet.entity.Supplier;
import edu.icet.util.CrudUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import java.util.ResourceBundle;

public class SuppliersFormController implements Initializable {

    public JFXTextField supplierNameText;
    public Label supplierNameLabel1;
    public ComboBox cmbTittle;
    public Label lblSupplierId;
    public TableView tblSupplier;
    public TableColumn colId;
    public TableColumn colTitle;
    public TableColumn colName;
    public TableColumn colContactNo;
    public TableColumn colCompany;

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
        generateId();
        loadCmbTitel();
        colId.setCellValueFactory(new PropertyValueFactory<>("supplier_Id"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colName.setCellValueFactory(new PropertyValueFactory<>("supplier_name"));
        colContactNo.setCellValueFactory(new PropertyValueFactory<>("contact_details"));
        colCompany.setCellValueFactory(new PropertyValueFactory<>("company_name"));

        loadTable();

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
                clearFields();
                loadTable();
            }else{
                new Alert(Alert.AlertType.ERROR,"Something went wrong..!").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void clearFields(){
        generateId();
        cmbTittle.setValue(null);
        supplierNameText.clear();
        supContactDetailsText.clear();
        supCompanyText.clear();
    }
    private void generateId() {
        try {
            ResultSet resultSet = CrudUtil.execute("SELECT supplier_Id FROM supplier ORDER BY supplier_Id DESC LIMIT 1");

            if (resultSet.next()){
                int num = Integer.parseInt(resultSet.getString(1).split("[S]")[1]);
                num++;
                lblSupplierId.setText(String.format("S%03d",num));
            }else {
                lblSupplierId.setText("S001");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void loadTable() {
        ObservableList<Supplier> list = FXCollections.observableArrayList();
        try {
            ResultSet resultSet = CrudUtil.execute("SELECT * FROM supplier");
            while (resultSet.next()) {
                list.add(new Supplier(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
                ));
            }
            tblSupplier.setItems(list);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void loadCmbTitel(){
        ObservableList<String> obs = FXCollections.observableArrayList("Mr.", "Mrs.");
        cmbTittle.getItems().addAll(obs);
    }
}

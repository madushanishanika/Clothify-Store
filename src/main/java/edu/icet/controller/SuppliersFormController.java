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

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SuppliersFormController implements Initializable {

    public JFXTextField supplierNameText;
    public Label supplierNameLabel1;
    public ComboBox cmbTittle;
    public Label lblSupplierId;
    public TreeTableView tblSupplier;
    public TreeTableColumn colName;
    public TreeTableColumn colTitle;
    public TreeTableColumn colId;
    public TreeTableColumn colContactNo;
    public TreeTableColumn colCompany;
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
        generateId();
    }
//    public void setData(TreeItem<SupplierTm> value){
//        lblSupplierId.setText(value.getValue().getSupID());
//        cmbTittle.setValue(value.getValue().getTitle());
//        supplierNameText.setText(value.getValue().getSupName());
//        supCompanyText.setText(value.getValue().getSupCompany());
//        supContactDetailsText.setText(value.getValue().getSupContactNumber());
//    }
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

            }else{
                new Alert(Alert.AlertType.ERROR,"Something went wrong..!").show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
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
//    public void loadTable() {
//        ObservableList<SupplierTm> tmList = FXCollections.observableArrayList();
//        List<Supplier> list = new ArrayList<>();
//        try {
//            ResultSet resultSet = CrudUtil.execute("SELECT * FROM supplier");
//
//            while (resultSet.next()) {
//                list.add(new Supplier(
//                        resultSet.getString(1),
//                        resultSet.getString(2),
//                        resultSet.getString(3),
//                        resultSet.getString(4),
//                        resultSet.getString(5)
//                ));
//            }
//
//            for (Supplier supplier : list) {
//                tmList.add(new SupplierTm(
//                        supplier.getSupID(),
//                        supplier.getTitle(),
//                        supplier.getSupName(),
//                        supplier.getSupContactNumber(),
//                        supplier.getSupCompany()
//                ));
//            }
//            TreeItem<SupplierTm> treeItem = new RecursiveTreeItem<>(tmList, RecursiveTreeObject::getChildren);
//            tblSupplier.setRoot(treeItem);
//            tblSupplier.setShowRoot(false);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public void loadCmbTitel(){
        ObservableList<String> obs = FXCollections.observableArrayList("Mr.", "Mrs.");
        cmbTittle.getItems().addAll(obs);
    }
}

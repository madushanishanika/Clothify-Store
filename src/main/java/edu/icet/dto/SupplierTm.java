package edu.icet.dto;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierTm extends RecursiveTreeObject<SupplierTm> {
    private String supID;
    private String title;
    private String supName;
    private String supContactNumber;
    private String supCompany;
}

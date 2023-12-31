package edu.icet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    private String supID;
    private String title;
    private String supName;
    private String supContactNumber;
    private String supCompany;
}

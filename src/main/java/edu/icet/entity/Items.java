package edu.icet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {
    private String itemId;
    private String desc;
    private String supplierId;
    private int qty;
    private String type;
    private String size;
    private double buyingPrice;
    private double sellingPrice;
    private double profit;

}

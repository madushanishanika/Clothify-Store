package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemsTm {
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

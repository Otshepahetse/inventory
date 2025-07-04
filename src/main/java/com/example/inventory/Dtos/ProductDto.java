package com.example.inventory.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {

    private Integer id;
    private String name;
    private String description;
    private int quantity;
    private double price;
}

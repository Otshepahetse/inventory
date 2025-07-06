package com.example.inventory.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SupplierDto {

    private Integer id;
    private String email;
    private String name;
    private String phone;


}

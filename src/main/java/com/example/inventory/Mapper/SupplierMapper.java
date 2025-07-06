package com.example.inventory.Mapper;

import com.example.inventory.Dtos.SupplierDto;
import com.example.inventory.Modal.Supplier;
import org.springframework.stereotype.Component;

@Component
public class SupplierMapper {

    public static Supplier toEntity(SupplierDto supplierDto) {

        Supplier supplier = new Supplier();

        supplier.setId(supplierDto.getId());
        supplier.setName(supplierDto.getName());
        supplier.setEmail(supplierDto.getEmail());
        supplier.setPhone(supplierDto.getPhone());

        return supplier;
    }

    public static SupplierDto toDto(Supplier supplier) {

        SupplierDto supplierDto = new SupplierDto();

        supplierDto.setId(supplier.getId());
        supplierDto.setName(supplier.getName());
        supplierDto.setEmail(supplier.getEmail());
        supplierDto.setPhone(supplier.getPhone());

        return supplierDto;
    }
}

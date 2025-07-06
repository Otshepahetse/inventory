package com.example.inventory.Services;

import com.example.inventory.Dtos.SupplierDto;

import java.util.List;

public interface SupplierServiceInterface {

    public SupplierDto getSupplierById(int id);

    public void deleteSupplier(int id);

    public SupplierDto addSupplier(SupplierDto supplierDto);

    public SupplierDto updateSupplier(SupplierDto supplierDto, int id);

    public List<SupplierDto> getAllSuppliers();
}

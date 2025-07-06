package com.example.inventory.Services.Impl;

import com.example.inventory.Dtos.SupplierDto;
import com.example.inventory.Exception.DataNotFoundException;
import com.example.inventory.Mapper.SupplierMapper;
import com.example.inventory.Modal.Supplier;
import com.example.inventory.Repositories.SupplierRepository;
import com.example.inventory.Services.SupplierServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierServiceInterface {


    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }




    @Override
    public SupplierDto addSupplier(SupplierDto supplierDto) {
        Supplier supplier = supplierRepository.save(SupplierMapper.toEntity(supplierDto));
        return SupplierMapper.toDto(supplier);
    }


    @Override
    public SupplierDto getSupplierById(int id) {
        Supplier supplier = supplierRepository.findById(id).orElseThrow(()->new DataNotFoundException("Supplier not found with id: " + id));
        return SupplierMapper.toDto(supplier);
    }


    @Override
    public List<SupplierDto> getAllSuppliers() {
        List<Supplier> suppliers = supplierRepository.findAll();
        return this.supplierRepository.findAll().stream().map(SupplierMapper::toDto).toList();
    }

    @Override
    public SupplierDto updateSupplier(SupplierDto supplierDto, int id) {

        Supplier supplier = supplierRepository.findById(id).orElseThrow(()->new DataNotFoundException("Supplier not found with id: " + id));

        supplier.setName(supplierDto.getName());
        supplier.setEmail(supplierDto.getEmail());
        supplier.setPhone(supplierDto.getPhone());

        return SupplierMapper.toDto(supplierRepository.save(supplier));
    }


    @Override
    public void deleteSupplier(int id) {
        Supplier supplier = supplierRepository.findById(id).orElseThrow(()->new DataNotFoundException("Supplier not found with id: " + id));
        supplierRepository.deleteById(id);
    }
}

package com.example.inventory.Controller;

import com.example.inventory.Dtos.SupplierDto;
import com.example.inventory.Services.SupplierServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/suppliers")
public class SupplierController {

    private final SupplierServiceInterface supplierServiceInterface;

    @Autowired
    public SupplierController(SupplierServiceInterface supplierServiceInterface) {
        this.supplierServiceInterface = supplierServiceInterface;
    }

    @GetMapping
    public List<SupplierDto> getAllSuppliers(){
        return supplierServiceInterface.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public SupplierDto getSupplierById(@PathVariable int id){
        return supplierServiceInterface.getSupplierById(id);
    }

    @PostMapping
    public SupplierDto addSupplier(@RequestBody SupplierDto supplierDto){
        return supplierServiceInterface.addSupplier(supplierDto);
    }

    @PutMapping("/{id}")
    public SupplierDto updateSupplier(@RequestBody SupplierDto supplierDto,@PathVariable int id){
        return supplierServiceInterface.updateSupplier(supplierDto, id);
    }

    @DeleteMapping("/{id}")
    public void deleteSupplier(@PathVariable int id){
        supplierServiceInterface.deleteSupplier(id);
    }

}

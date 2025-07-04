package com.example.inventory.Controller;

import com.example.inventory.Dtos.ProductDto;
import com.example.inventory.Services.ProductServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductServicesInterface productServicesInterface;

    @Autowired
    public ProductController(ProductServicesInterface productServicesInterface) {
        this.productServicesInterface = productServicesInterface;
    }

    @GetMapping
    public List<ProductDto> getAllProducts(){
        return List.of();
    }
}

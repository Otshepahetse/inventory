package com.example.inventory.Services.Impl;

import com.example.inventory.Repositories.ProductRepository;
import com.example.inventory.Services.ProductServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductServicesInterface {

    private ProductRepository productRepository;

    @Autowired
    public ProductServicesImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String getProductById(int id) {
        return "";
    }

    @Override
    public String getAllProducts() {
        return "";
    }


    @Override
    public String addProduct() {
        return "";
    }

    @Override
    public String updateProduct() {
        return "";
    }

    @Override
    public void deleteProduct() {

    }
}

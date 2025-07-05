package com.example.inventory.Services;

import com.example.inventory.Dtos.ProductDto;

import java.util.List;

public interface ProductServicesInterface {

    public ProductDto getProductById(int id);

    public List<ProductDto> getAllProducts();

    public ProductDto addProduct(ProductDto productDto);

    public ProductDto updateProduct(ProductDto productDto, int id);

    public void deleteProduct(int id);
}

package com.example.inventory.Services.Impl;

import com.example.inventory.Dtos.ProductDto;
import com.example.inventory.Mapper.ProductMapper;
import com.example.inventory.Modal.Product;
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
    public ProductDto getProductById(int id) {
        Product product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));

        return ProductMapper.toDto(product);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(ProductMapper::toDto).toList();
    }


    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Product product = productRepository.save(ProductMapper.toEntity(productDto));
        return ProductMapper.toDto(product);
    }

    @Override
    public ProductDto updateProduct(ProductDto productDto, int id) {
        Product product = productRepository.findById(id).orElseThrow();

        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setQuantity(productDto.getQuantity());
        product.setPrice(productDto.getPrice());

        return ProductMapper.toDto(productRepository.save(product));
    }

    @Override
    public void deleteProduct(int id) {
        Product product = productRepository.findById(id).orElseThrow();
        productRepository.deleteById(id);
    }
}

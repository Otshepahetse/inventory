package com.example.inventory.Mapper;

import com.example.inventory.Dtos.ProductDto;
import com.example.inventory.Modal.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public static Product toEntity(ProductDto productDto) {

        Product product = new Product ();

          product.setId(productDto.getId());
          product.setName(productDto.getName());
          product.setDescription(productDto.getDescription());
          product.setQuantity(productDto.getQuantity());
          product.setPrice(productDto.getPrice());

        return product;
    }

    public static ProductDto toDto(Product product) {

        ProductDto productDto = new ProductDto();

        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setQuantity(product.getQuantity());
        productDto.setPrice(product.getPrice());

        return productDto;
    }
}

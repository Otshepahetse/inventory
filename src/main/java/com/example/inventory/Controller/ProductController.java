package com.example.inventory.Controller;

import com.example.inventory.Dtos.ProductDto;
import com.example.inventory.Services.ProductServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return this.productServicesInterface.getAllProducts();
    }


    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable int id){
        return this.productServicesInterface.getProductById(id);
    }


    @PostMapping
    public ProductDto addProduct(@RequestBody ProductDto productDto){
        return this.productServicesInterface.addProduct(productDto);
    }


    @PutMapping("/{id}")
    public ProductDto updateProduct(@RequestBody ProductDto productDto,@PathVariable int id){
        return this.productServicesInterface.updateProduct(productDto, id);
    }


    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        this.productServicesInterface.deleteProduct(id);
    }
}

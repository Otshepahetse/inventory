package com.example.inventory.Services;

public interface ProductServicesInterface {

    public String getProductById(int id);

    public String getAllProducts();

    public String addProduct();

    public String updateProduct();

    public void deleteProduct();
}

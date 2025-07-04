package com.example.inventory.Repositories;

import com.example.inventory.Modal.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.function.Supplier;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

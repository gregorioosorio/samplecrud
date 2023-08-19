package com.godev.samplecrud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godev.samplecrud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(long id);

    boolean deleteById(long id);
}
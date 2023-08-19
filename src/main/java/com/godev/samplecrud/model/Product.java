package com.godev.samplecrud.model;
 
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    private float price;
}
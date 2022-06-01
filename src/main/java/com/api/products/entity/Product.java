package com.api.products.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private UUID productCode;
    private String name;
    private String description;
    private String category;
    private BigDecimal price;
    private Integer quantity;


}

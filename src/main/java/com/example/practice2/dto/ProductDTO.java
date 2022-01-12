package com.example.practice2.dto;

import com.example.practice2.model.Product;
import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private Integer code;
    private Double price;

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.code = product.getCode();
        this.price = product.getPrice();
    }
}

package com.example.practice2.dto;

import com.example.practice2.model.Supplier;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class SupplierDTO {

    private Long id;
    private String name;
    private String INN;
    private String address;
    private String phone;
    private List<ProductDTO> products;

    public SupplierDTO(Supplier supplier) {
        this.id = supplier.getId();
        this.name = supplier.getName();
        this.INN = supplier.getINN();
        this.address = supplier.getAddress();
        this.phone = supplier.getPhone();
        this.products =
                supplier.getProducts().stream()
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }
}

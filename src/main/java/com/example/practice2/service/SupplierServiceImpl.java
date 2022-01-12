package com.example.practice2.service;

import com.example.practice2.dto.SupplierDTO;
import com.example.practice2.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SupplierServiceImpl implements SupplierService {

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<SupplierDTO> getAll() {
        return supplierRepository.findAll().stream()
                .map(SupplierDTO::new)
                .collect(Collectors.toList());
    }
}

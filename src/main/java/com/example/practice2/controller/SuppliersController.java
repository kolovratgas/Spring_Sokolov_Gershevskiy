package com.example.practice2.controller;

import com.example.practice2.dto.SupplierDTO;
import com.example.practice2.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class SuppliersController {

    private final SupplierService supplierService;

    @Autowired
    public SuppliersController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/suppliers")
    public String getAllSuppliers(Model model) {
        List<SupplierDTO> suppliers = supplierService.getAll();

        model.addAttribute("suppliers", suppliers);

        return "view_suppliers";
    }
}

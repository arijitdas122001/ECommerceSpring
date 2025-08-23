package com.example.Springboot.Ecommerce.controllers;

import com.example.Springboot.Ecommerce.Services.IProductService;
import com.example.Springboot.Ecommerce.dto.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    IProductService iProductService;
    ProductController(IProductService iProductService){
        this.iProductService=iProductService;
    }
    @GetMapping("/{id}")
    public ProductDTO getProductsById(@PathVariable int id) throws IOException {
        return this.iProductService.getProductById(id);
    };
}

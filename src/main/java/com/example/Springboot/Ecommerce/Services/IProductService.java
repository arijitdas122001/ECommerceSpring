package com.example.Springboot.Ecommerce.Services;

import com.example.Springboot.Ecommerce.dto.ProductDTO;

import java.io.IOException;

public interface IProductService {
    ProductDTO getProductById(int id) throws IOException;
}

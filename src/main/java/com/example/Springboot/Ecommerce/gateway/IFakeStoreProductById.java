package com.example.Springboot.Ecommerce.gateway;

import com.example.Springboot.Ecommerce.dto.ProductDTO;

import java.io.IOException;

public interface IFakeStoreProductById {

    ProductDTO getProductById(int id) throws IOException;
}

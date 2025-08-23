package com.example.Springboot.Ecommerce.gateway;

import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;
import com.example.Springboot.Ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.Springboot.Ecommerce.dto.ProductDTO;
import com.example.Springboot.Ecommerce.gateway.Api.GetProductByIdApi;

import java.io.IOException;

public class FakeStoreProductGateway implements IFakeStoreProductById {

    GetProductByIdApi getProductByIdApi;
    public  FakeStoreProductGateway(GetProductByIdApi getProductByIdApi){
        this.getProductByIdApi=getProductByIdApi;
    }
    @Override
    public ProductDTO getProductById(int id) throws IOException {
        FakeStoreProductResponseDTO response=getProductByIdApi.getProductById(id).execute().body();
        if(response==null){
            throw new IOException("Failed to get the product by id");
        }
        return response.getProduct();
    }
}

package com.example.Springboot.Ecommerce.Services;

import com.example.Springboot.Ecommerce.dto.ProductDTO;
import com.example.Springboot.Ecommerce.gateway.ICategoryGateway;
import com.example.Springboot.Ecommerce.gateway.IFakeStoreProductById;

import java.io.IOException;

public class FakeStoreProductByIdService implements IProductService{

    IFakeStoreProductById iFakeStoreProductById;
    public FakeStoreProductByIdService(IFakeStoreProductById iFakeStoreProductById){
        this.iFakeStoreProductById=iFakeStoreProductById;
    }
    @Override
    public ProductDTO getProductById(int id) throws IOException {
        return  this.iFakeStoreProductById.getProductById(id) ;
    }
}

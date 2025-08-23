package com.example.Springboot.Ecommerce.gateway.Api;

import com.example.Springboot.Ecommerce.dto.FakeStoreProductResponseDTO;
import com.example.Springboot.Ecommerce.dto.ProductDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.io.IOException;

public interface GetProductByIdApi {
    @GET("products/{id}")
    Call<FakeStoreProductResponseDTO>getProductById(@Path("id") int id) throws IOException;
}


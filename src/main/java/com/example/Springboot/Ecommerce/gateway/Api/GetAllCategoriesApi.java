package com.example.Springboot.Ecommerce.gateway.Api;

import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;


public interface GetAllCategoriesApi {
@GET("products/category")
Call<FakeStoreCategoryDTO> getFakeStoreCategories() throws IOException;
}

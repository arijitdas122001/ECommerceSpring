package com.example.Springboot.Ecommerce.gateway;

import com.example.Springboot.Ecommerce.dto.CategoryDTO;
import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;
import com.example.Springboot.Ecommerce.gateway.Api.GetAllCategoriesApi;
import org.springframework.stereotype.Component;
import java.util.*;
import java.io.IOException;

@Component
public class FakeStoreCategoryGateway implements  IFakeStoreCategoryGateway{

    private  final GetAllCategoriesApi getAllCategoriesApi;

    public FakeStoreCategoryGateway(GetAllCategoriesApi getAllCategoriesApi) {
        this.getAllCategoriesApi=getAllCategoriesApi;
    }
    @Override
    public List<CategoryDTO> getFakeStoreCategories() throws IOException {
        FakeStoreCategoryDTO response=this.getAllCategoriesApi.getFakeStoreCategories().execute().body();
        if(response==null){
            throw new IOException("Failed to fetch categories from fake store api");
        }
        return response.getCategories().stream()
                .map(category->CategoryDTO.builder()
                        .name(category)
                        .build()
                ).toList();
    }
}

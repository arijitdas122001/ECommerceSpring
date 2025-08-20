package com.example.Springboot.Ecommerce.gateway;

import com.example.Springboot.Ecommerce.dto.CategoryDTO;
import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;
import com.example.Springboot.Ecommerce.gateway.Api.GetAllCategoriesApi;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreCategoryGateway implements  IFakeStoreCategoryGateway{

    private  final GetAllCategoriesApi getAllCategoriesApi;

    public  FakeStoreCategoryGateway(GetAllCategoriesApi getAllCategoriesApi) {
        this.getAllCategoriesApi=getAllCategoriesApi;
    }
    @Override
    public FakeStoreCategoryDTO getFakeStoreCategories() throws IOException {
        FakeStoreCategoryDTO fakeStoreCategoryDTOResponse=this.getAllCategoriesApi.getFakeStoreCategories().execute().body();
        return fakeStoreCategoryDTOResponse;
    }
}

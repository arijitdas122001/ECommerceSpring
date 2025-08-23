package com.example.Springboot.Ecommerce.Services;

import com.example.Springboot.Ecommerce.dto.CategoryDTO;
import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;
import com.example.Springboot.Ecommerce.gateway.FakeStoreCategoryGateway;
import com.example.Springboot.Ecommerce.gateway.ICategoryGateway;
import com.example.Springboot.Ecommerce.gateway.IFakeStoreCategoryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements  ICategoryService{

    IFakeStoreCategoryGateway ifakestorecategorygateway;

    FakeStoreCategoryService(IFakeStoreCategoryGateway ifakestorecategorygateway) {
        this.ifakestorecategorygateway=ifakestorecategorygateway;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return  ifakestorecategorygateway.getFakeStoreCategories();
    }
}

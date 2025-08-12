package com.example.Springboot.Ecommerce.Services;

import com.example.Springboot.Ecommerce.gateway.FakeStoreCategoryGateway;
import com.example.Springboot.Ecommerce.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements  ICategoryService{

    private  final ICategoryGateway categoryGateway;
    CategoryService(ICategoryGateway CategoryGateway){
        this.categoryGateway=CategoryGateway;
    }
    @Override
    public List<String> getAllCategories() {
        return null;
    }
}

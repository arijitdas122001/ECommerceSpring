package com.example.Springboot.Ecommerce.gateway;

import com.example.Springboot.Ecommerce.dto.CategoryDTO;
import org.springframework.stereotype.Component;

@Component
public class FakeStoreCategoryGateway implements  ICategoryGateway{
    @Override
    public CategoryDTO getAllCategories() {
        return null;
    }
}

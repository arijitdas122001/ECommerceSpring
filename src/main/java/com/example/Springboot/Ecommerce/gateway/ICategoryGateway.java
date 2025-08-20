package com.example.Springboot.Ecommerce.gateway;

import com.example.Springboot.Ecommerce.dto.CategoryDTO;
import org.springframework.stereotype.Component;

@Component
public interface ICategoryGateway {
     CategoryDTO getAllCategories();
}

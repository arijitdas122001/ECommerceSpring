package com.example.Springboot.Ecommerce.controllers;


import com.example.Springboot.Ecommerce.Services.FakeStoreCategoryService;
import com.example.Springboot.Ecommerce.Services.ICategoryService;
import com.example.Springboot.Ecommerce.dto.CategoryDTO;
import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import  java.util.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    ICategoryService categoryService;
    public CategoryController(ICategoryService categoryService) {
        this.categoryService=categoryService;
    }
    @GetMapping
    public List<CategoryDTO> getAllCategories() throws  IOException {
        return categoryService.getAllCategories();
    }
}

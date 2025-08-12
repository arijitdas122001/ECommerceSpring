package com.example.Springboot.Ecommerce.controllers;


import com.example.Springboot.Ecommerce.Services.CategoryService;
import com.example.Springboot.Ecommerce.Services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  java.util.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private CategoryService categoryService;

    CategoryController(CategoryService categoryService){
        this.categoryService=categoryService;
    }
    @GetMapping("/getAllCategories")
    public List<String> getAllCategories(){
        return categoryService.getAllCategories();
    }
}

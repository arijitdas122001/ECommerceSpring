package com.example.Springboot.Ecommerce.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @GetMapping("/getAllCategories")
    public String GetElectronics(){
        return "Electronics";
    }
}

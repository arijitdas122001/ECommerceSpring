package com.example.Springboot.Ecommerce.Services;

import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    FakeStoreCategoryDTO getAllCategories() throws IOException;
}

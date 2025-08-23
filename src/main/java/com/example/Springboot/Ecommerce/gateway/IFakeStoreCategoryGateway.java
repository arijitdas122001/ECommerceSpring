package com.example.Springboot.Ecommerce.gateway;

import com.example.Springboot.Ecommerce.dto.CategoryDTO;
import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;
import  java.util.*;
import java.io.IOException;

public interface IFakeStoreCategoryGateway {
    List<CategoryDTO> getFakeStoreCategories() throws IOException;
}

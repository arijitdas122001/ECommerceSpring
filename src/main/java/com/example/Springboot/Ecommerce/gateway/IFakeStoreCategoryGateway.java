package com.example.Springboot.Ecommerce.gateway;

import com.example.Springboot.Ecommerce.dto.FakeStoreCategoryDTO;

import java.io.IOException;

public interface IFakeStoreCategoryGateway {
    FakeStoreCategoryDTO getFakeStoreCategories() throws IOException;
}

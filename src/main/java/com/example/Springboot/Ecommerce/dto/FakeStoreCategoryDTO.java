package com.example.Springboot.Ecommerce.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreCategoryDTO {
    String status;
    String message;
    List<String>categories;
}

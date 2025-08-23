package com.example.Springboot.Ecommerce.dto;
import lombok.*;

import java.util.*;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreCategoryDTO {
    String status;
    String message;
    List<String>categories;
}


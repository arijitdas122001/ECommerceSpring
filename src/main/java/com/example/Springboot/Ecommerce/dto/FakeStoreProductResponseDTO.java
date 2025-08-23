package com.example.Springboot.Ecommerce.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreProductResponseDTO {
    private ProductDTO product;
    private String message;
    private String status;
}

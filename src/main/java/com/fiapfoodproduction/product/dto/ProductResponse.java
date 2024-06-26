package com.fiapfoodproduction.product.dto;

import com.fiapfoodproduction.category.dto.CategoryResponse;
import lombok.Data;

@Data
public class ProductResponse {
    private Long id;
    private String name;
    private Double price;
    private CategoryResponse category;
    private String information;
}

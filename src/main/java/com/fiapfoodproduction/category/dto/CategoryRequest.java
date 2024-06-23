package com.fiapfoodproduction.category.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CategoryRequest {

    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

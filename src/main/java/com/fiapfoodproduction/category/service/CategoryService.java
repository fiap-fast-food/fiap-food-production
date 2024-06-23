package com.fiapfoodproduction.category.service;

import com.fiapfoodproduction.category.dto.CategoryRequest;
import com.fiapfoodproduction.core.exception.NotFoundException;
import com.fiapfoodproduction.core.model.CategoryEntity;

public interface CategoryService {
    CategoryEntity insert(CategoryRequest category);
    void update(CategoryRequest category) throws NotFoundException;
    CategoryEntity find(String categoryName) throws NotFoundException;
    CategoryEntity find(Long id) throws NotFoundException;
    void delete(Long id) throws NotFoundException;
}

package com.fiapfoodproduction.product.service;

import com.fiapfoodproduction.core.exception.NotFoundException;
import com.fiapfoodproduction.core.model.ProductEntity;
import com.fiapfoodproduction.product.dto.ProductRequest;

import java.util.List;

public interface ProductService {
    ProductEntity insert(ProductRequest productRequest) throws NotFoundException;
    void delete(Long id);
    void update(ProductEntity productEntity);
    List<ProductEntity> findByCategoryName(String categoryName);
    ProductEntity findById(Long id) throws NotFoundException;
    ProductEntity findByProductName(String productName) throws NotFoundException;
}

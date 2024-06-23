package com.fiapfoodproduction.product.service;

import com.fiapfoodproduction.assembler.CategoryMapper;
import com.fiapfoodproduction.assembler.ProductMapper;
import com.fiapfoodproduction.category.service.CategoryService;
import com.fiapfoodproduction.core.exception.NotFoundException;
import com.fiapfoodproduction.core.model.ProductEntity;
import com.fiapfoodproduction.core.repository.ProductRepository;
import com.fiapfoodproduction.product.dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public ProductEntity insert(ProductRequest product) throws NotFoundException {
        var productEntity = productMapper.toEntity(product);
        var category = categoryService.find(product.getNameCategory());
        productEntity.setCategory(category);
        return productRepository.save(productEntity);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void update(ProductEntity product) {
        productRepository.save(product);
    }

    @Override
    public List<ProductEntity> findByCategoryName(String categoryName) {
        List<ProductEntity> products = productRepository.findByCategoryName(categoryName);
        return products;
    }

    @Override
    public ProductEntity findById(Long id) throws NotFoundException {
        var productEntity = productRepository.findById(id).orElseThrow(() -> new NotFoundException("Product not found"));
        return productEntity;
    }

    @Override
    public ProductEntity findByProductName(String productName) throws NotFoundException {
        var productEntity = productRepository.findByName(productName).orElseThrow(() -> new NotFoundException("Product not found"));
        return productEntity;
    }
}

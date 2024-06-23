package com.fiapfoodproduction.assembler;

import com.fiapfoodproduction.core.model.ProductEntity;
import com.fiapfoodproduction.product.dto.ProductRequest;
import com.fiapfoodproduction.product.dto.ProductResponse;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    private ModelMapper modelMapper;
    PropertyMap<ProductRequest, ProductMapper> skipModifiedFieldsMap = new PropertyMap<>() {
        protected void configure() {
        }
    };
    public ProductMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.modelMapper.addMappings(skipModifiedFieldsMap);
    }
    public ProductEntity toEntity(@Valid ProductRequest request) {

        ProductEntity productEntity = modelMapper.map(request, ProductEntity.class);
        return productEntity;
    }

    public ProductRequest toRequest(ProductEntity request) {

        ProductRequest productEntity = modelMapper.map(request, ProductRequest.class);
        return productEntity;
    }
    public ProductResponse toOutput(ProductEntity productEntity) {

        ProductResponse productResponse = modelMapper.map(productEntity, ProductResponse.class);
        return productResponse;
    }
}

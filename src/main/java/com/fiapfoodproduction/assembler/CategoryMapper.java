package com.fiapfoodproduction.assembler;

import com.fiapfoodproduction.category.dto.CategoryRequest;
import com.fiapfoodproduction.category.dto.CategoryResponse;
import com.fiapfoodproduction.core.model.CategoryEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    private ModelMapper modelMapper;
    PropertyMap<CategoryRequest, CategoryEntity> skipModifiedFieldsMap = new PropertyMap<>() {
        protected void configure() {
        }
    };
    public CategoryMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.modelMapper.addMappings(skipModifiedFieldsMap);
    }
    public CategoryEntity toEntity(CategoryRequest request) {

        CategoryEntity category = modelMapper.map(request, CategoryEntity.class);
        return category;
    }
    public CategoryResponse toOutput(CategoryEntity categoryEntity) {

        CategoryResponse categoryResponse = modelMapper.map(categoryEntity, CategoryResponse.class);
        return categoryResponse;
    }
}

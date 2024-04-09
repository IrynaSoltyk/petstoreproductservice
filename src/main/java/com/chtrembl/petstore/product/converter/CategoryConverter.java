package com.chtrembl.petstore.product.converter;


import com.chtrembl.petstore.product.entity.Category;

public class CategoryConverter {

    public static com.chtrembl.petstore.product.model.Category convert(Category category) {
        com.chtrembl.petstore.product.model.Category categoryModel = new com.chtrembl.petstore.product.model.Category();
        categoryModel.setId(category.getId());
        categoryModel.setName(category.getName());

        return categoryModel;
    }
}

package com.chtrembl.petstore.product.converter;

import java.util.ArrayList;
import java.util.List;

import com.chtrembl.petstore.product.entity.Product;

public class ProductConverter {

    public static List<com.chtrembl.petstore.product.model.Product> convertAll(List<Product> products) {
        List<com.chtrembl.petstore.product.model.Product> productModels = new ArrayList<>(products.size());
        for (Product product : products) {
            productModels.add(convert(product));
        }

        return productModels;
    }

    public static com.chtrembl.petstore.product.model.Product convert(Product pet) {
        com.chtrembl.petstore.product.model.Product petModel = new com.chtrembl.petstore.product.model.Product();
        petModel.setId(pet.getId());
        petModel.setName(pet.getName());
        petModel.setPhotoURL(pet.getPhotoURL());
        petModel.setCategory(CategoryConverter.convert(pet.getCategory()));
        petModel.setTags(TagConverter.convertAll(pet.getTags()));

        return petModel;
    }
}

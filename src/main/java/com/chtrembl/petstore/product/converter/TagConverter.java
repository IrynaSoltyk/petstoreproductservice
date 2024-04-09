package com.chtrembl.petstore.product.converter;

import java.util.ArrayList;
import java.util.List;

import com.chtrembl.petstore.product.entity.Tag;


public class TagConverter {

    public static List<com.chtrembl.petstore.product.model.Tag> convertAll(List<Tag> tags) {
        List<com.chtrembl.petstore.product.model.Tag> tagModels = new ArrayList<>(tags.size());
        for (Tag tag : tags) {
            tagModels.add(convert(tag));
        }

        return tagModels;
    }

    public static com.chtrembl.petstore.product.model.Tag convert(Tag tag) {
        com.chtrembl.petstore.product.model.Tag tagModel = new com.chtrembl.petstore.product.model.Tag();
        tagModel.setId(tag.getId());
        tagModel.setName(tag.getName());

        return tagModel;
    }
}

package com.chtrembl.petstore.product.service;

import java.util.List;

import com.chtrembl.petstore.product.converter.ProductConverter;
import com.chtrembl.petstore.product.model.Product;
import com.chtrembl.petstore.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        List<com.chtrembl.petstore.product.entity.Product> productEntities = productRepository.findAll();

        return ProductConverter.convertAll(productEntities);
    }
}

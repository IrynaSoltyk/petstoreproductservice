package com.chtrembl.petstore.product.model;

import java.util.ArrayList;
import java.util.List;

import com.chtrembl.petstore.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("data")
public class DataPreload {

	@Autowired
	private ProductService productService;

	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return productService.getProducts();//products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
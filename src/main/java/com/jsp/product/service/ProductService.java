package com.jsp.product.service;

import com.jsp.product.dao.ProductDao;

import com.jsp.product.dto.Product;


public class ProductService {
	ProductDao productDao = new ProductDao();

	public Product createProduct(Product product) {
		return productDao.createProduct(product);
	}

	public Product geProductById(int id) {
		return productDao.getproductByID(id);
	}

	public Product deleteProductById(int id) {
		return productDao.deleteProduct(id);
	}

	public Product updateProductById(int id, String name, int price) {

		return productDao.updateProduct(id, name, price);
	}
}

package com.jsp.product.controller;


import com.jsp.product.service.ProductService;
import com.jsp.product.service.ReviewService;

public class UpdateConroller {

	public static void main(String[] args) {
		ReviewService reviewService = new ReviewService();
		reviewService.updateReview(3, 9, "good");

		ProductService productService = new ProductService();
		productService.updateProductById(1,"TV", 45000);

	}

}

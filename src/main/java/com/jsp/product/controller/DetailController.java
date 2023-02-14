package com.jsp.product.controller;

import com.jsp.product.service.ProductService;
import com.jsp.product.service.ReviewService;

public class DetailController {

	public static void main(String[] args) {
		ReviewService reviewService = new ReviewService();
		reviewService.getreviewByID(1);
		
		ProductService productService = new ProductService();
		productService.geProductById(1);
	}

}

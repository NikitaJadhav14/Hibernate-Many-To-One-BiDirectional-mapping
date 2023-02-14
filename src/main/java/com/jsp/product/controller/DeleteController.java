package com.jsp.product.controller;


import com.jsp.product.service.ProductService;
import com.jsp.product.service.ReviewService;

public class DeleteController {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		productService.deleteProductById(1);
		
		ReviewService reviewService = new ReviewService();
		reviewService.deleteReview(4);
		
		
		
		

	}

}

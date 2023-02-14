package com.jsp.product.controller;

import com.jsp.product.dto.Product;
import com.jsp.product.dto.Review;
import com.jsp.product.service.ProductService;
import com.jsp.product.service.ReviewService;

public class SaveController {
	public static void main(String[] args) {

		ReviewService reviewService = new ReviewService();
		ProductService productService = new ProductService();

		Product product = new Product();
		product.setP_name("A.C");
		product.setP_price(40000);
		productService.createProduct(product);

		Review r1 = new Review();
		r1.setResponse("neutral");
		r1.setRating(4);
		r1.setProduct(product);
		reviewService.creatReview(r1);

		Review r2 = new Review();
		r2.setResponse("neutral");
		r2.setRating(4);
		r2.setProduct(product);
		reviewService.creatReview(r2);

		Review r3 = new Review();
		r3.setResponse("good");
		r3.setRating(1);
		r3.setProduct(product);
		reviewService.creatReview(r3);

	}

}

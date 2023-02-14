package com.jsp.product.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.product.dto.Product;


public class ProductDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Product createProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

		System.out.println("Product Details Saved..");
		return product;

	}

	public Product getproductByID(int id) {
		Product p1 = entityManager.find(Product.class, id);
		return p1;
	}

	
	public Product deleteProduct(int id) {
		Product p1 = entityManager.find(Product.class, id);

		entityTransaction.begin();
		entityManager.remove(p1);
		entityTransaction.commit();

		System.out.println("Product Details Deleted..");
		return p1;
	}

	public Product updateProduct(int id, String name, int price) {
		Product p1 = entityManager.find(Product.class, id);

		if (p1 != null) {
			p1.setP_name(name);
			p1.setP_price(price);
			entityTransaction.begin();
			entityManager.merge(p1);
			entityTransaction.commit();

		} else {
			System.out.println("Product Details found..");

		}
		return p1;
	}
}

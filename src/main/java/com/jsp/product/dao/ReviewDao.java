package com.jsp.product.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.product.dto.Review;

public class ReviewDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Nikita");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Review createReiew(Review review) {
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();

		System.out.println("Review Details Saved..");
		return review;

	}

	public Review getReviewByID(int id) {
		Review r1 = entityManager.find(Review.class, id);
		return r1;
	}

	public Review deleteReviewByID(int id) {
		Review r1 = entityManager.find(Review.class, id);

		entityTransaction.begin();
		entityManager.remove(r1);
		entityTransaction.commit();

		System.out.println("Review Details ..");
		return r1;
	}

	public Review updateReview(int id, int rating, String response) {
		Review r1 = entityManager.find(Review.class, id);

		if (r1 != null) {
			r1.setRating(rating);
			r1.setResponse(response);
			entityTransaction.begin();
			entityManager.merge(r1);
			entityTransaction.commit();

		} else {
			System.out.println("Review Details found..");

		}
		return r1;
	}

}

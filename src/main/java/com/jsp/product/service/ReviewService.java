package com.jsp.product.service;

import com.jsp.product.dao.ReviewDao;
import com.jsp.product.dto.Review;

public class ReviewService {
	ReviewDao reviewDao = new ReviewDao();

	public Review creatReview(Review review) {
		return reviewDao.createReiew(review);
	}

	public Review getreviewByID(int id) {
		return reviewDao.getReviewByID(id);

	}

	public Review deleteReview(int id) {
		return reviewDao.deleteReviewByID(id);

	}

	public Review updateReview(int id, int rating, String response) {
		return reviewDao.updateReview(id, rating, response);

	}

}

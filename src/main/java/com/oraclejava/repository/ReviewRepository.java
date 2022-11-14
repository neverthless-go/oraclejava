package com.oraclejava.repository;

import com.oraclejava.domain.Review;

public interface ReviewRepository {

	Iterable<Review> findAll();
}

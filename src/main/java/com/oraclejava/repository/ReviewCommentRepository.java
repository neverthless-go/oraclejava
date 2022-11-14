package com.oraclejava.repository;

import com.oraclejava.domain.ReviewComment;

public interface ReviewCommentRepository {

	Iterable<ReviewComment> findByReviewId(int reviewId);
}

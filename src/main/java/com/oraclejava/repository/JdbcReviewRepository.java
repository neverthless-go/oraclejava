package com.oraclejava.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.oraclejava.domain.Review;

@Repository
public class JdbcReviewRepository implements ReviewRepository {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcReviewRepository(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Iterable<Review> findAll() {
		String sql = "select * from review order by id desc";
		return jdbcTemplate.query(sql, this::mapRowToReview);
	}
	
	private Review mapRowToReview(ResultSet rs, int rowNum)
	throws SQLException {
		
		Review review = new Review();
		review.setId(rs.getInt("id"));
		review.setProductId(rs.getInt("product_id"));
		review.setName(rs.getString("name"));
		review.setDate(rs.getString("r_date"));
		review.setContent(rs.getString("content"));
		return review;
	}
}

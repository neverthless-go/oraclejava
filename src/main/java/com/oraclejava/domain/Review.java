package com.oraclejava.domain;

import java.io.Serializable;
import java.util.List;

public class Review implements Serializable{

	private Integer id;
	private Integer productId;
	private String name;
	private String date;
	private String content;
	private List<ReviewComment> reviewCommentList;
	
	
	public Review(Integer id, Integer productId, String name, String date, String content,
			List<ReviewComment> reviewCommentList) {
		super();
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.date = date;
		this.content = content;
		this.reviewCommentList = reviewCommentList;
	}
	
	public Review() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<ReviewComment> getReviewCommentList() {
		return reviewCommentList;
	}
	public void setReviewCommentList(List<ReviewComment> reviewCommentList) {
		this.reviewCommentList = reviewCommentList;
	}
	
	
	
	
}

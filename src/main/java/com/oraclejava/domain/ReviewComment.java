package com.oraclejava.domain;

public class ReviewComment {

	private Integer id;
	private String name;
	private String content;
	private Integer reviewId;
	
	
	public ReviewComment(Integer id, String name, String content, Integer reviewId) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.reviewId = reviewId;
	}
	
	public ReviewComment() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getReviewId() {
		return reviewId;
	}
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}
	
	
}

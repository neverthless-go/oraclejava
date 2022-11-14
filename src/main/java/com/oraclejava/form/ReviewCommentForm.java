package com.oraclejava.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ReviewCommentForm {

	private Integer id;
	
	@NotNull(message="이름을 입력해주세요")
	@Size(min=1, max=100, message="이름은 1자이상 입력해주세요")
	private String name;
	
	@NotNull(message="이름을 입력해주세요")
	@Size(min=1, max=100, message="이름은 1자이상 입력해주세요")
	private String content;
	private Integer reviewId;
	
	
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

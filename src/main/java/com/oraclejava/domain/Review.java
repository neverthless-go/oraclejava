package com.oraclejava.domain;

import java.io.Serializable;
import java.util.List;

public class Review implements Serializable{

	private Integer id;
	private Integer cosId;
	private String name;
	private String date;
	private String content;
	private List<ReviewComment> reviewCommentList;
	
	
	public Review(Integer id, Integer cosId, String name, String date, String content,
			List<ReviewComment> reviewCommentList) {
		super();
		this.id = id;
		this.cosId = cosId;
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
	public Integer getcosId() {
		return cosId;
	}
	public void setProductId(Integer cosId) {
		this.cosId = cosId;
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

package com.oraclejava.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ReviewForm {

	private Integer id;
	private Integer cosId;
	
	@NotNull(message="글쓴이 이름을 입력해 주세요")
	@Size(min=1, max=100, message="글쓴이 이름은 1자이상 100자 이내로 입력해 주세요")
	private String name;
	private String date;
	
	@NotNull(message="글쓴이 이름을 입력해 주세요")
	@Size(min=1, max=100, message="글쓴이 이름은 1자이상 100자 이내로 입력해 주세요")
	private String content;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getcosId() {
		return cosId;
	}
	public void setcosId(Integer cosId) {
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
	
	
	
}

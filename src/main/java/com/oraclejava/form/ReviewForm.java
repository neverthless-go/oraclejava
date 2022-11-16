package com.oraclejava.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ReviewForm {

	private Integer id;
	
	@NotNull(message="제품번호를 선택해주세요")
	private Integer cosId;
	
	@NotNull(message="글쓴이 이름을 입력해 주세요")
	@Size(min=1, max=100, message="글쓴이 이름은 1자이상 100자 이내로 입력해 주세요")
	private String name;
	
	@NotNull(message="해당 날짜를 선택해주세요")
	private String r_date;
	
	@NotNull(message="글쓴이 이름을 입력해 주세요")
	@Size(min=1, max=100, message="글쓴이 이름은 1자이상 100자 이내로 입력해 주세요")
	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCosId() {
		return cosId;
	}

	public void setCosId(Integer cosId) {
		this.cosId = cosId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ReviewForm [id=" + id + ", cosId=" + cosId + ", name=" + name + ", r_date=" + r_date + ", content="
				+ content + "]";
	}
	
	
	
	
	
	
	
}
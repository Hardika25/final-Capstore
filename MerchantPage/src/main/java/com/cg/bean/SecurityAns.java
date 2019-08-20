package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class SecurityAns {
	@Id
	@Column(length=30)
	private String emailId;
	private String answer1;
	private String answer2;
	
	public SecurityAns() {
		// TODO Auto-generated constructor stub
	}

	public SecurityAns(String emailId, String answer1, String answer2) {
		super();
		this.emailId = emailId;
		this.answer1 = answer1;
		this.answer2 = answer2;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	
	
}

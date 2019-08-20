package com.cg.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="token")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Token {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer tokenId;
	
	@Column
	private Integer confirmationToken;
	
	@Column
	private Date dateOfCreation;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="User1.userId")
	private User1 user;
	

	public Token() {
		// TODO Auto-generated constructor stub
	}


	public Token(Integer confirmationToken, Date dateOfCreation, User1 user) {
		super();
		this.confirmationToken = confirmationToken;
		this.dateOfCreation = dateOfCreation;
		this.user = user;
	}


	public Integer getTokenId() {
		return tokenId;
	}


	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}


	public Integer getConfirmationToken() {
		return confirmationToken;
	}


	public void setConfirmationToken(Integer confirmationToken) {
		this.confirmationToken = confirmationToken;
	}


	public Date getDateOfCreation() {
		return dateOfCreation;
	}


	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}


	public User1 getUser() {
		return user;
	}


	public void setUser(User1 user) {
		this.user = user;
	}
	
	
}

package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="review")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Review {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer reviewId;
	
	@ManyToOne
	@JoinColumn(name="Product.productId")
	private Product product;
	
	@Column
	private String review;
	
	@ManyToOne
	@JoinColumn(name="User1.userId")
	private User1 user;
	
	@Column
	private Integer star;

	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(Product product, String review, User1 user, Integer star) {
		super();
		this.product = product;
		this.review = review;
		this.user = user;
		this.star = star;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public User1 getUser() {
		return user;
	}

	public void setUser(User1 user) {
		this.user = user;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}
	
	
}

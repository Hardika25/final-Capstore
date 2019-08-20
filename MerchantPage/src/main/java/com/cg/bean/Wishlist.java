package com.cg.bean;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Table(name="wishlist")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Wishlist {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer wishlistId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="User1.userId")
	private User1 user;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="Product.productId")
	private List<Product> products;
	
	@Column
	private String name;

	public Wishlist() {
		// TODO Auto-generated constructor stub
	}

	public Wishlist(User1 user, List<Product> products, String name) {
		super();
		this.user = user;
		this.products = products;
		this.name = name;
	}

	public Integer getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(Integer wishlistId) {
		this.wishlistId = wishlistId;
	}

	public User1 getUser() {
		return user;
	}

	public void setUser(User1 user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

package com.cg.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer transactionId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="User1.userId")
	private User1 user;
	
	@ElementCollection
	private List<Integer[]> products;
	
	@Column(length=50)
	private String status;
	
	private Date dateOfPurchase;
	
	@Column(length=50)
	private String modeOfPurchase;
	
	
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(User1 user, List<Integer[]> products, String status, Date dateOfPurchase,
			String modeOfPurchase) {
		super();
		this.user = user;
		this.products = products;
		this.status = status;
		this.dateOfPurchase = dateOfPurchase;
		this.modeOfPurchase = modeOfPurchase;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public User1 getUser() {
		return user;
	}

	public void setUser(User1 user) {
		this.user = user;
	}

	public List<Integer[]> getProducts() {
		return products;
	}

	public void setProducts(List<Integer[]> products) {
		this.products = products;
	}
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public String getModeOfPurchase() {
		return modeOfPurchase;
	}

	public void setModeOfPurchase(String modeOfPurchase) {
		this.modeOfPurchase = modeOfPurchase;
	}
	
	
}

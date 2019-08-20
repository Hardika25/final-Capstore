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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Return {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer returnId;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Transaction.transactionId")
	private Transaction transaction;
	
	private Date pickUpDate;
	
	@Column(length=50)
	private String status;
	
	public Return() {
		// TODO Auto-generated constructor stub
	}

	public Return(Transaction transaction, Date pickUpDate, String status) {
		super();
		this.transaction = transaction;
		this.pickUpDate = pickUpDate;
		this.status = status;
	}

	public Integer getReturnId() {
		return returnId;
	}

	public void setReturnId(Integer returnId) {
		this.returnId = returnId;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Date getPickUpDate() {
		return pickUpDate;
	}

	public void setPickUpDate(Date pickUpDate) {
		this.pickUpDate = pickUpDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}

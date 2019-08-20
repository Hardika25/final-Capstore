package com.cg.bean;

import java.util.Date;
import java.util.List;

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
public class Coupon {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer couponid;
	
	@Column(nullable=false)
	private Date startDate;
	
	@Column(nullable=false)
	private Date endDate;
	
	@Column(length=50,nullable=false)
	private String couponName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="User1.userId")
	private User1 user;
	
	@Column(nullable=false)
	private Double discount;

	
	public Coupon() {
		// TODO Auto-generated constructor stub
	}




	public Integer getCouponid() {
		return couponid;
	}


	public void setCouponid(Integer couponid) {
		this.couponid = couponid;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getCouponName() {
		return couponName;
	}


	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}


	


	public User1 getUser() {
		return user;
	}




	public void setUser(User1 user) {
		this.user = user;
	}




	public Double getDiscount() {
		return discount;
	}


	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	


	
	
	
}

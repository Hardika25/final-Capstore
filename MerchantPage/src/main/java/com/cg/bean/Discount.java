package com.cg.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="discount1")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Discount {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer discountId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Product.productID")
	private Product product;
	
	@Column
	private Double discount;
	
	@Column
	private Date startDate;
	
	@Column
	private Date endDate;

	public Discount() {
		// TODO Auto-generated constructor stub
	}

	public Discount(Product product, Double discount, Date startDate, Date endDate) {
		super();
		this.product = product;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Integer getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
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

	@Override
	public String toString() {
		return "Discount [discountId=" + discountId + ", product=" + product + ", discount=" + discount + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}
	
	
	
}

package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Promocode {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer promocodeId;
	
	@Column(length=20)
	private String promocode;
	
	public Promocode() {
		// TODO Auto-generated constructor stub
	}

	public Promocode(String promocode) {
		super();
		this.promocode = promocode;
	}

	public Integer getPromocodeId() {
		return promocodeId;
	}

	public void setPromocodeId(Integer promocodeId) {
		this.promocodeId = promocodeId;
	}

	public String getPromocode() {
		return promocode;
	}

	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	
	
}

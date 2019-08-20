package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TPMerchant {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer merchantId;
	
	@Column(length=20, nullable=false)
	private String firstName;
	
	@Column(length=20, nullable=true)
	private String lastName;
	
	@Column(length=30, nullable=false)
	private String company;
	
	@Column(length=30, nullable=false, unique=true)
	private String emailid;
	
	@Column(length=10, nullable=false, unique=true)
	private Long mobileno;
	
	

	public TPMerchant() {
		// TODO Auto-generated constructor stub
	}



	public TPMerchant(Integer merchantId, String firstName, String lastName, String company, String emailid,
			Long mobileno) {
		super();
		this.merchantId = merchantId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.emailid = emailid;
		this.mobileno = mobileno;
	}



	public Integer getMerchantId() {
		return merchantId;
	}



	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getEmailid() {
		return emailid;
	}



	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



	public Long getMobileno() {
		return mobileno;
	}



	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	
	
	
}

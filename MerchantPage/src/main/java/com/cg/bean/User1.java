package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User1 {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer userId;
	
	@Column(length=30, unique=true, nullable=false)
	private String emailid;
	
	@Column(length=20, nullable=false)
	private String firstName;
	
	@Column(length=20, nullable=true)
	private String lastName;
	
	@Column(length=20, nullable=false)
	private String password;
	
	@Column(length=10, unique=true, nullable=false)
	private Long mobileNo;
	
	@Column(length=150, nullable=false)
	private String address;
	
	@Column(length=100) // must have a default photo for that
	private String photo;

	public User1() {
		// TODO Auto-generated constructor stub
	}

	public User1(String emailid, String firstName, String lastName, String password, Long mobileNo,
			String address, String photo) {
		super();
		this.emailid = emailid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mobileNo = mobileNo;
		this.address = address;
		this.photo = photo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}

package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer adminId;
	
	@Column(length=20, nullable=false)
	private String firstName;
	
	@Column(length=20, nullable=true)
	private String lastName;
	
	@Column(length=30, nullable=false, unique=true)
	private String emailid;
	
	@Column(length=20, nullable=false)
	private String password;
	
	@Column(length=100)
	private String photo;

	public Admin(String firstName, String lastName, String emailid, String password, String photo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailid = emailid;
		this.password = password;
		this.photo = photo;
	}
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailid="
				+ emailid + ", password=" + password + ", photo=" + photo + "]";
	}
}

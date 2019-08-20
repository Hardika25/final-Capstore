package com.cg.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer invoiceId;
	
	private Date dateOfIssue;
	
	private String buildTo;
	
	private String soldBy;
	
	private String billSummary;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	public Invoice(Date dateOfIssue, String buildTo, String soldBy, String billSummary) {
		super();
		this.dateOfIssue = dateOfIssue;
		this.buildTo = buildTo;
		this.soldBy = soldBy;
		this.billSummary = billSummary;
	}

	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getBuildTo() {
		return buildTo;
	}

	public void setBuildTo(String buildTo) {
		this.buildTo = buildTo;
	}

	public String getSoldBy() {
		return soldBy;
	}

	public void setSoldBy(String soldBy) {
		this.soldBy = soldBy;
	}

	public String getBillSummary() {
		return billSummary;
	}

	public void setBillSummary(String billSummary) {
		this.billSummary = billSummary;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", dateOfIssue=" + dateOfIssue + ", buildTo=" + buildTo + ", soldBy="
				+ soldBy + ", billSummary=" + billSummary + "]";
	}
	
	
}

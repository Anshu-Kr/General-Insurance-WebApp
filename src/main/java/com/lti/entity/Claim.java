package com.lti.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Claim {

	@Id
	@SequenceGenerator(name = "claimSeqGen", sequenceName = "mySeq", initialValue = 1001, allocationSize = 100)
	@GeneratedValue(generator = "claimSeqGen")
	private int claim_no;
	private Date date_of_apply;
	private Boolean approved;
	private String accident_type;
	private int amount;
	
	//private int policy_no;
	
	public int getClaim_no() {
		return claim_no;
	}
	public void setClaim_no(int claim_no) {
		this.claim_no = claim_no;
	}
	public Date getDate_of_apply() {
		return date_of_apply;
	}
	public void setDate_of_apply(Date date_of_apply) {
		this.date_of_apply = date_of_apply;
	}
	public Boolean getApproved() {
		return approved;
	}
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	public String getAccident_type() {
		return accident_type;
	}
	public void setAccident_type(String accident_type) {
		this.accident_type = accident_type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

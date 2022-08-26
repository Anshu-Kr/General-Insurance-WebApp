package com.lti.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOTOR_INSURANCE")
public class MotorInsurance {

	@Id
	@Column(name = "POLICY_NO")
	private int policy_no;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "MANUFACTURER")
	private String manufacturer;

	@Column(name = "MODEL_NO")
	private int model_no;

	@Column(name = "PURCHASE_DATE")
	private Date purachse_date;

	@Column(name = "DATE_OF_EXPIRY")
	private Date date_of_expiry;

	@Column(name = "REGISTRATION_NO")
	private String registration_no;

	@Column(name = "ENGINE_NO")
	private String engine_no;

	@Column(name = "CHASIS_NO")
	private String chasis_no;

	@Column(name = "PLAN")
	private String plan;

	@Column(name = "YEAR")
	private int year;

	@Column(name = "CLAIMED")
	private boolean claimed;

	public int getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(int policy_no) {
		this.policy_no = policy_no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getModel_no() {
		return model_no;
	}

	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}

	public Date getPurachse_date() {
		return purachse_date;
	}

	public void setPurachse_date(Date purachse_date) {
		this.purachse_date = purachse_date;
	}

	public Date getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(Date date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getEngine_no() {
		return engine_no;
	}

	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}

	public String getChasis_no() {
		return chasis_no;
	}

	public void setChasis_no(String chasis_no) {
		this.chasis_no = chasis_no;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isClaimed() {
		return claimed;
	}

	public void setClaimed(boolean claimed) {
		this.claimed = claimed;
	}

	@Override
	public String toString() {
		return "Motor_Insurance [policy_no=" + policy_no + ", type=" + type + ", manufacturer=" + manufacturer
				+ ", model_no=" + model_no + ", purachse_date=" + purachse_date + ", date_of_expiry=" + date_of_expiry
				+ ", registration_no=" + registration_no + ", engine_no=" + engine_no + ", chasis_no=" + chasis_no
				+ ", plan=" + plan + ", year=" + year + ", claimed=" + claimed + "]";
	}

}

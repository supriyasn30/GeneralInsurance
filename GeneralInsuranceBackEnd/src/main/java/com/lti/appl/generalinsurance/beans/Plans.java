package com.lti.appl.generalinsurance.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLANS")
public class Plans 
{
	/*
	 * create table planes( plane_id number(5) primary key, plane_type varchar2(15)
	 * not null, plane_duration varchar2(6) not null);
	 */
	@Id
	@Column(name="PLAN_ID",length=5)
	private int planID;
	
	@Column(name="PLAN_TYPE",length=15)
	private int planType;
	
	@Column(name="PLAN_DURATION",length=6)
	private Date planDuration;

	public int getPlanID() {
		return planID;
	}

	public void setPlanID(int planID) {
		this.planID = planID;
	}

	public int getPlanType() {
		return planType;
	}

	public void setPlanType(int planType) {
		this.planType = planType;
	}

	public Date getPlanDuration() {
		return planDuration;
	}

	public void setPlanDuration(Date planDuration) {
		this.planDuration = planDuration;
	}

	public Plans(int planID, int planType, Date planDuration) {
		super();
		this.planID = planID;
		this.planType = planType;
		this.planDuration = planDuration;
	}

	public Plans() {
		super();
	}

	@Override
	public String toString() {
		return "Plans [planID=" + planID + ", planType=" + planType + ", planDuration=" + planDuration + "]";
	}
	
	

}

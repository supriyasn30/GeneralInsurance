package com.lti.appl.generalinsurance.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLAIMS")
public class Claims 
{
	/*
	 * create table claims( claim_id number(5) primary key, claim_date date not
	 * null, policy_id number(5) not null, vechile_id number(5) not null, plane_id
	 * number(5) not null);
	 */
	@Id
	@Column(name="CLAIM_ID", length=5)
	private int claimID;
	
	@Column(name="CLAIM_DATE")
	private Date claimDate;
	
	@Column(name="POLICY_ID")
	private Policies pID;
	
	@Column(name="VEHICLE_ID")
	private Vehicle vID;
	
	@Column(name="PLAN_ID")
	private Plans planID;

	public int getClaimID() {
		return claimID;
	}

	public void setClaimID(int claimID) {
		this.claimID = claimID;
	}

	public Date getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}

	public Policies getpID() {
		return pID;
	}

	public void setpID(Policies pID) {
		this.pID = pID;
	}

	public Vehicle getvID() {
		return vID;
	}

	public void setvID(Vehicle vID) {
		this.vID = vID;
	}

	public Plans getPlanID() {
		return planID;
	}

	public void setPlanID(Plans planID) {
		this.planID = planID;
	}

	public Claims(int claimID, Date claimDate, Policies pID, Vehicle vID, Plans planID) {
		super();
		this.claimID = claimID;
		this.claimDate = claimDate;
		this.pID = pID;
		this.vID = vID;
		this.planID = planID;
	}

	public Claims() {
		super();
	}

	@Override
	public String toString() {
		return "Claims [claimID=" + claimID + ", claimDate=" + claimDate + ", pID=" + pID + ", vID=" + vID + ", planID="
				+ planID + "]";
	}
	
	

}

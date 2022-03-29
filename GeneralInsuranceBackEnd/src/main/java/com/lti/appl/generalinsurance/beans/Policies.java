package com.lti.appl.generalinsurance.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POLICIES")
public class Policies 
{
	/*
	 * create table policies_table( policy_id number(5) primary key, start_date date
	 * not null, renewal_date date not null, ticket_id number(6) unique, status
	 * varchar2(15) not null, amount number(8) not null, plane_id number(5) not
	 * null, admin_id number(5) not null);
	 */
	@Id
	@Column(name="POLICY_ID", length=5)
	private int pID;
	
	@Column(name="START_DATE")
	private Date startDate;
	
	@Column(name="RENEWAL_DATE")
	private Date renewalDate;
	
	@Column(name="TICKET_ID", length=5)
	private int ticketId;
	
	@Column(name="AMOUNT", length=8)
	private double amount;
	
	@Column(name="PLAN_ID")
	private Plans planID;
	
	@Column(name="ADMIN_ID")
	private Admins adminID;

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Plans getPlanID() {
		return planID;
	}

	public void setPlanID(Plans planID) {
		this.planID = planID;
	}

	public Admins getAdminID() {
		return adminID;
	}

	public void setAdminID(Admins adminID) {
		this.adminID = adminID;
	}

	public Policies(int pID, Date startDate, Date renewalDate, int ticketId, double amount, Plans planID,
			Admins adminID) {
		super();
		this.pID = pID;
		this.startDate = startDate;
		this.renewalDate = renewalDate;
		this.ticketId = ticketId;
		this.amount = amount;
		this.planID = planID;
		this.adminID = adminID;
	}

	public Policies() {
		super();
	}

	@Override
	public String toString() {
		return "Policies [pID=" + pID + ", startDate=" + startDate + ", renewalDate=" + renewalDate + ", ticketId="
				+ ticketId + ", amount=" + amount + ", planID=" + planID + ", adminID=" + adminID + "]";
	}
	
	
	

}

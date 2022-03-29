package com.lti.appl.generalinsurance.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGISTRATIONS")
public class Registration 
{
	/*
	 * create table user_details( reg_id number(5) primary key, reg_name
	 * varchar2(15) not null, reg_email varchar2(25) not null, reg_contact
	 * number(12) not null, reg_address varchar(15) not null, reg_password
	 * varchar2(25) not null, login_id number(7) unique);
	 */

	@Id
	@Column(name="REG_ID", length=5)
	private int regID;
	
	@Column(name="REG_NAME", length=15)
	private String regName;
	
	@Column(name="REG_EMAIL", length=25)
	private String regEmail;
	
	@Column(name="REG_CONTACT", length=12)
	private long regContact;
	
	@Column(name="REG_ADDRESS", length=15)
	private String regAddress;
	
	@Column(name="REG_PASSWORD", length=10)
	private String regPwd;
	
	@Column(name="REG_LOGINID", length=7)
	private String regLoginID;

	public int getRegID() {
		return regID;
	}

	public void setRegID(int regID) {
		this.regID = regID;
	}

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	public String getRegEmail() {
		return regEmail;
	}

	public void setRegEmail(String regEmail) {
		this.regEmail = regEmail;
	}

	public long getRegContact() {
		return regContact;
	}

	public void setRegContact(long regContact) {
		this.regContact = regContact;
	}

	public String getRegAddress() {
		return regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public String getRegPwd() {
		return regPwd;
	}

	public void setRegPwd(String regPwd) {
		this.regPwd = regPwd;
	}

	public String getRegLoginID() {
		return regLoginID;
	}

	public void setRegLoginID(String regLoginID) {
		this.regLoginID = regLoginID;
	}

	public Registration(int regID, String regName, String regEmail, long regContact, String regAddress, String regPwd,
			String regLoginID) {
		super();
		this.regID = regID;
		this.regName = regName;
		this.regEmail = regEmail;
		this.regContact = regContact;
		this.regAddress = regAddress;
		this.regPwd = regPwd;
		this.regLoginID = regLoginID;
	}

	public Registration() {
		super();
	}

	@Override
	public String toString() {
		return "Registration [regID=" + regID + ", regName=" + regName + ", regEmail=" + regEmail + ", regContact="
				+ regContact + ", regAddress=" + regAddress + ", regPwd=" + regPwd + ", regLoginID=" + regLoginID + "]";
	}
	
	

}

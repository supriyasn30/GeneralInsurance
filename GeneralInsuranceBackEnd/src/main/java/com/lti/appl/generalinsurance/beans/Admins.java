package com.lti.appl.generalinsurance.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMINS")
public class Admins 
{
	/*
	 *create table Admins( admin_id number(5) primary key, admin_name
	 * varchar2(15) not null, admin_email varchar2(25) not null, admin_contact
	 * number(12) not null, admin_password varchar(25) not null, adminLogin_id
	 * number(7) unique);
	 */
@Id
@Column(name="ADMIN_ID",length=5)
private int adminID;

@Column(name="ADMIN_NAME",length=15)
private String adminName;

@Column(name="ADMIN_EMAIL",length=25)
private String adminEmail;

@Column(name="ADMIN_CONTACT",length=12)
private long adminContact;

@Column(name="ADMIN_PASSWORD",length=10)
private String adminPassword;

@Column(name="ADMIN_LOGINID",length=7)
private int adminLoginID;

public int getAdminID() {
	return adminID;
}

public void setAdminID(int adminID) {
	this.adminID = adminID;
}

public String getAdminName() {
	return adminName;
}

public void setAdminName(String adminName) {
	this.adminName = adminName;
}

public String getAdminEmail() {
	return adminEmail;
}

public void setAdminEmail(String adminEmail) {
	this.adminEmail = adminEmail;
}

public long getAdminContact() {
	return adminContact;
}

public void setAdminContact(long adminContact) {
	this.adminContact = adminContact;
}

public String getAdminPassword() {
	return adminPassword;
}

public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}

public int getAdminLoginID() {
	return adminLoginID;
}

public void setAdminLoginID(int adminLoginID) {
	this.adminLoginID = adminLoginID;
}

public Admins(int adminID, String adminName, String adminEmail, long adminContact, String adminPassword,
		int adminLoginID) {
	super();
	this.adminID = adminID;
	this.adminName = adminName;
	this.adminEmail = adminEmail;
	this.adminContact = adminContact;
	this.adminPassword = adminPassword;
	this.adminLoginID = adminLoginID;
}

public Admins() {
	super();
}

@Override
public String toString() {
	return "Admins [adminID=" + adminID + ", adminName=" + adminName + ", adminEmail=" + adminEmail + ", adminContact="
			+ adminContact + ", adminPassword=" + adminPassword + ", adminLoginID=" + adminLoginID + "]";
}





}

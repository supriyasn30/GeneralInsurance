package com.lti.appl.generalinsurance.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="VEHICLES")
public class Vehicle 
{
	/*
	 * create table vechile_reg( vechile_id number(5) primary key , vechile_name
	 * varchar2(20) not null, vechile_model varchar2(25) not null, purchase_date
	 * date not null, reg_no number(10) not null, chassis_no number(20) not null,
	 * vechile_type varchar2(10) not null, reg_id number(5) not null );
	 */
	
	@Id
	@Column(name="VEHICLE_ID",length=5)
	private int vID;
	
	@Column(name="VEHICLE_NAME",length=20)
	private String vName;
	
	@Column(name="VEHICLE_MODEL",length=25)
	private String vModel;
	
	@Column(name="PURCHASE_DATE")
	private Date purchaseDate;
	
	@Column(name="VEHICLE_REGNO",length=10)
	private long vRegNo;
	
	@Column(name="CHASSIS_NO",length=20)
	private long chassisNo;
	
	@Column(name="VEHICLE_TYPE",length=10)
	private String vType;
	
	//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})  
	@JoinColumn(name="REG_ID")
	private Registration regID;

	public int getvID() {
		return vID;
	}

	public void setvID(int vID) {
		this.vID = vID;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvModel() {
		return vModel;
	}

	public void setvModel(String vModel) {
		this.vModel = vModel;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public long getvRegNo() {
		return vRegNo;
	}

	public void setvRegNo(long vRegNo) {
		this.vRegNo = vRegNo;
	}

	public long getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(long chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getvType() {
		return vType;
	}

	public void setvType(String vType) {
		this.vType = vType;
	}

	

	public Registration getRegID() {
		return regID;
	}

	public void setRegID(Registration regID) {
		this.regID = regID;
	}

	

	public Vehicle(int vID, String vName, String vModel, Date purchaseDate, long vRegNo, long chassisNo, String vType,
			Registration regID) {
		super();
		this.vID = vID;
		this.vName = vName;
		this.vModel = vModel;
		this.purchaseDate = purchaseDate;
		this.vRegNo = vRegNo;
		this.chassisNo = chassisNo;
		this.vType = vType;
		this.regID = regID;
	}

	public Vehicle() {
		super();
	}

	@Override
	public String toString() {
		return "Vehicle [vID=" + vID + ", vName=" + vName + ", vModel=" + vModel + ", purchaseDate=" + purchaseDate
				+ ", vRegNo=" + vRegNo + ", chassisNo=" + chassisNo + ", vType=" + vType + ", regID=" + regID + "]";
	}
	
	
	


}

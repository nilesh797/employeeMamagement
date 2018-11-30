package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Employee {
	@Id
private long eid;
@Column
private String ename;
@Column
private String mobileNo;
@Column
private String email;


public Employee() {
	
}


public Employee(String ename, String mobileNo, String email) {
	super();
	this.ename = ename;
	this.mobileNo = mobileNo;
	this.email = email;
}


public long getEid() {
	return eid;
}


public void setEid(long eid) {
	this.eid = eid;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public String getMobileNo() {
	return mobileNo;
}


public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


}

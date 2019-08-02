package com.capgemini.contactbook.bean;

public class EnquiryBean {
private long enqryId;
private String fName;
private String lName;
private long contactNo;
private String pLocation;
private String pDomain;
public long getEnqryId() {
	return enqryId;
}
public void setEnqryId(long enqryId) {
	this.enqryId = enqryId;
}
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getIName() {
	return lName;
}
public void setIName(String iName) {
	lName = iName;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
public String getpLocation() {
	return pLocation;
}
public void setpLocation(String pLocation) {
	this.pLocation = pLocation;
}
public String getpDomain() {
	return pDomain;
}
public void setpDomain(String pDomain) {
	this.pDomain = pDomain;
}
public EnquiryBean(long enqryId, String fName, String lName, long contactNo, String pLocation, String pDomain) {
	super();
	this.enqryId = enqryId;
	this.fName = fName;
	this.lName = lName;
	this.contactNo = contactNo;
	this.pLocation = pLocation;
	this.pDomain = pDomain;
}
@Override
public String toString() {
	return "EnquiryBean [enqryId=" + enqryId + ", fName=" + fName + ", lName=" + lName + ", contactNo=" + contactNo
			+ ", pLocation=" + pLocation + ", pDomain=" + pDomain + "]";
}

}

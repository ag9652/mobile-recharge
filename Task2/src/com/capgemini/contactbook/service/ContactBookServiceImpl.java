package com.capgemini.contactbook.service;

import com.capgemini.contactbook.bean.EnquiryBean;

public interface ContactBookServiceImpl {
	public long addEnquiry();
	public EnquiryBean getEnquiryDetails(long id);

}

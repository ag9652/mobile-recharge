package com.capgemini.contactbook.dao;

import com.capgemini.contactbook.bean.EnquiryBean;

public interface ContactBookDaoImpl {
	 public long addEnquiry(EnquiryBean bean);
		public EnquiryBean getEnquiryDetails(long id);


}

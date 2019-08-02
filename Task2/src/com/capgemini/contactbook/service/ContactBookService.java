package com.capgemini.contactbook.service;

import com.capgemini.contactbook.bean.EnquiryBean;
import com.capgemini.contactbook.dao.ContactBookDao;

public class ContactBookService {
 ContactBookDao d = new ContactBookDao();
  
 
public long addEnquiry(EnquiryBean bean)
{
	long eId = d.addEnquiry(bean);
	return eId;
}
public EnquiryBean getEnquiryDetails(long id)
{
	EnquiryBean b11= d.getEnquiryDetails(id);
	return b11;
	
}
}

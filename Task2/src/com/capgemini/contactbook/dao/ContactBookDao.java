package com.capgemini.contactbook.dao;
import java.util.HashMap;
import java.util.Map;
import com.capgemini.contactbook.bean.EnquiryBean;

public class ContactBookDao {
	long eId1=1111,eId;
	 private Map<Long,EnquiryBean>enquiryEntry;
	 public long addEnquiry(EnquiryBean bean)
	 {
		 eId=++eId1;
		 HashMap<Long, EnquiryBean> enquiryEntry = new HashMap<Long,EnquiryBean>();
		 enquiryEntry.put(eId,bean);
		 bean.setEnqryId(eId);
		 return eId;
	 }
	
	public EnquiryBean getEnquiryDetails(long id)
	{
		// TODO Auto-generated method stub
EnquiryBean bean1 = enquiryEntry.get(id);
		if(enquiryEntry.containsKey(id))
		 {
			 return null;
		 }
		 else {
			 return bean1;
		 }
	}
}

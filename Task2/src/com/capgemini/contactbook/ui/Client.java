package com.capgemini.contactbook.ui;

import java.util.Scanner;

import com.capgemini.contactbook.bean.EnquiryBean;
import com.capgemini.contactbook.service.ContactBookService;


public class Client {
	ContactBookService s = new ContactBookService();
	Scanner sc = new Scanner(System.in);
	
	
	void stmt() {
		System.out.println("***********Global Details************");
		System.out.println("Choose an operation");
		System.out.println("1.Enter Enquiry Details");
		System.out.println("2.View Enquiry Details on Id");
		System.out.println("3.Exit");
	}
	void choice()
	{
		while(1!=0)
		{
			stmt();
			Scanner sc = new Scanner(System.in);
			   int n=sc.nextInt();
			   
			ContactBookService b = null;
			switch(n)
			   {
			   case 1:
				   
				   System.out.println("Enter First Name");
				   String fName = sc.next();
				   System.out.println("Last Name");
				   String lName = sc.next();
				   System.out.println("Enter contact number");
				   long contactNo =sc.nextLong();
				   System.out.println("Enter Preferred Domain");
				   String pDomain = sc.next();
				   System.out.println("Enter preferred location");
				   String pLocation = sc.next();
				   long enquryId = (long) Math.random();
				EnquiryBean bean = new EnquiryBean(enquryId,fName,lName,contactNo,pLocation,pDomain);
				   long enqryId =  s.addEnquiry(bean);
				   System.out.println("Thank you"+fName+" "+lName+"your Unique Id is"+enqryId+" we will contact you shortly" );
				  
					break;
			   case 2:
				   System.out.println("enter your id");
				   long id=sc.nextLong();
				   EnquiryBean b1 = s.getEnquiryDetails(id);
				   System.out.println(b1);
				   
				   
				   
				  
			   }
		}
	}
	public static void main(String[] args) {
		
		Client a = new Client();
		a.choice();
	}
}
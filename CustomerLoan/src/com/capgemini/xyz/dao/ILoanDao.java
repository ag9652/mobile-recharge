package com.capgemini.xyz.dao;

import com.capgemini.xyz.bean.Customer;
import com.capgemini.xyz.bean.Loan;

public interface ILoanDao {
	public long insertCust(Customer cust);
	public Loan applyLoan(Loan loan);


}
